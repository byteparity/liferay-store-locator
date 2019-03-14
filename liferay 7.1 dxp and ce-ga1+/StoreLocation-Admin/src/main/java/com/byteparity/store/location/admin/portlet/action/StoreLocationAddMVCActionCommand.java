package com.byteparity.store.location.admin.portlet.action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil;
import com.byteparity.store.location.admin.portlet.exception.StoreLocationEmptyFieldException;
import com.byteparity.store.location.admin.portlet.exception.StoreLocationExcessFieldLimitSizeException;
import com.byteparity.store.location.admin.portlet.exception.StoreLocationNonStringException;
import com.byteparity.store.location.admin.portlet.portlet.StoreLocationAdminPortlet;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
		immediate=true,
		property={
			"javax.portlet.name="+StoreLocationAdminPortlet.PORTLET_ID,
			"mvc.command.name=/store/submit"
		},
		service=MVCActionCommand.class
)
public class StoreLocationAddMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay td = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long storeId = ParamUtil.getLong(actionRequest, "storeId");
		String storeName = ParamUtil.getString(actionRequest, "storeName");
		String address1 = ParamUtil.getString(actionRequest, "address1");
		String address2 = ParamUtil.getString(actionRequest, "address2");
		String city = ParamUtil.getString(actionRequest, "city");
		String state = ParamUtil.getString(actionRequest, "state");
		String country = ParamUtil.getString(actionRequest, "country");
		String zip = ParamUtil.getString(actionRequest, "zip");
		String phone = ParamUtil.getString(actionRequest, "phone");
		String latitude = ParamUtil.getString(actionRequest, "latitude");
		String longitude = ParamUtil.getString(actionRequest, "longitude");
		
		long groupId = td.getScopeGroupId();
		long companyId = td.getCompanyId();
		long userId = td.getUserId();
		
		StoreInformation storeInformation = null;
		if(Validator.isNotNull(storeId)){
			storeInformation = StoreInformationLocalServiceUtil.getStoreInformation(storeId);
		}else{
			storeId = CounterLocalServiceUtil.increment(StoreInformation.class.getName());
			storeInformation = StoreInformationLocalServiceUtil.createStoreInformation(storeId);
			storeInformation.setCreateDate(new Date());
			storeInformation.setNew(true);
		}
		storeInformation.setStoreName(storeName);
		storeInformation.setAddress1(address1);
		storeInformation.setAddress2(address2);
		storeInformation.setCity(city);
		storeInformation.setState(state);
		storeInformation.setCountry(country);
		storeInformation.setZip(zip);
		storeInformation.setPhone(phone);
		storeInformation.setLatitude(latitude);
		storeInformation.setLongitude(longitude);
		storeInformation.setCreatedBy(userId);
		storeInformation.setGroupId(groupId);
		storeInformation.setCompanyId(companyId);
		storeInformation.setModifiedDate(new Date());
		
		try {
			storeInformationValidator(actionRequest, storeInformation);
			if(storeInformation.isNew()){
				StoreInformationLocalServiceUtil.addStoreInformation(storeInformation);
			}else{
				StoreInformationLocalServiceUtil.updateStoreInformation(storeInformation);
			}
			reindex(StoreInformation.class.getName(), storeInformation);

		}catch(StoreLocationEmptyFieldException | StoreLocationNonStringException | StoreLocationExcessFieldLimitSizeException sefEx) {
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			_log.error(sefEx.getMessage(), sefEx);
		}
	}
	
	public static void reindex(String className, Object object) throws SearchException{
		
		Indexer indexer = IndexerRegistryUtil.getIndexer(className);
		try{
			indexer.reindex(object);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void storeInformationValidator(PortletRequest request, StoreInformation storeInformation) throws Exception{
		
		if(Validator.isNull(storeInformation.getStoreName()) || Validator.isNull(storeInformation.getAddress1())
	|| Validator.isNull(storeInformation.getCity()) || Validator.isNull(storeInformation.getState())
	|| Validator.isNull(storeInformation.getCountry()) || Validator.isNull(storeInformation.getZip())
	|| Validator.isNull(storeInformation.getPhone()) || Validator.isNull(storeInformation.getLatitude()) || Validator.isNull(storeInformation.getLongitude())){
			SessionErrors.add(request, "storeInformationValidationError");
			throw new StoreLocationEmptyFieldException("StoreInformation cannot be empty. Please fill required information.");
		}
		
		if((Validator.isNotNull(storeInformation.getZip()) && !isNumeric(storeInformation.getZip())) 
				|| (Validator.isNotNull(storeInformation.getLatitude()) && !isNumeric(storeInformation.getLatitude()))
				|| (Validator.isNotNull(storeInformation.getLongitude()) && !isNumeric(storeInformation.getLongitude()))){
			
			SessionErrors.add(request, "storeLocationNonStringException");
			throw new StoreLocationNonStringException("Zip, Latitude & Longitude should not contain characters. Please fill proper data.");
		
		}
		
		if(storeInformation.getAddress1().length()>200 || storeInformation.getCity().length()>75 ||
				storeInformation.getState().length()>75 || storeInformation.getCountry().length()>75 ||
				storeInformation.getZip().length()>8 || storeInformation.getPhone().length()>15 ||
				storeInformation.getLatitude().length()>50 || storeInformation.getLongitude().length()>50) {
			SessionErrors.add(request, "storeLocationExcessFieldLimitSizeException");
			throw new StoreLocationExcessFieldLimitSizeException("Field size is greater than required.");
		}
	}
	
	public static boolean isNumeric(String str){
		
		if(!str.matches("-?\\d*\\.?\\d+")) {
			return false;
		}
		return true;
	}

	private Log _log = LogFactoryUtil.getLog(StoreLocationAddMVCActionCommand.class);
}