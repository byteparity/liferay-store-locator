package com.byteparity.store.location.admin.portlet.action;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil;
import com.byteparity.store.location.admin.portlet.portlet.StoreLocationAdminPortlet;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+StoreLocationAdminPortlet.PORTLET_ID,
			"mvc.command.name=/store/edit"
		},
		service = MVCRenderCommand.class
)
public class StoreLocationEditMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		long storeId = ParamUtil.getLong(renderRequest, "storeId");
		String viewDetail = ParamUtil.getString(renderRequest, "view");
		StoreInformation storeInformation = null;
		if(Validator.isNotNull(storeId)){
			try {
				storeInformation = StoreInformationLocalServiceUtil.getStoreInformation(storeId);
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		if(Validator.isNotNull(viewDetail)){
			renderRequest.setAttribute("viewDetail", viewDetail);
		}
		renderRequest.setAttribute("store", storeInformation);
		
		PortletPreferences portletPreferences = renderRequest.getPreferences();
		String googleAPIKey = portletPreferences.getValue("googleAPIKey", StringPool.BLANK);
		renderRequest.setAttribute("googleAPIKey", googleAPIKey);
		
		return "/editStore.jsp";
	}
}