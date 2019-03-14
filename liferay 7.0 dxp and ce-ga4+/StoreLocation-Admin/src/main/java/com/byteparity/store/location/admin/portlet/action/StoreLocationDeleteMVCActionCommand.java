package com.byteparity.store.location.admin.portlet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil;
import com.byteparity.store.location.admin.portlet.portlet.StoreLocationAdminPortlet;
import com.byteparity.store.location.admin.portlet.util.StoreLocationIndexer;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		immediate=true,
		property={
			"javax.portlet.name="+StoreLocationAdminPortlet.PORTLET_ID,
			"mvc.command.name=/store/delete"
		},
		service=MVCActionCommand.class
)
public class StoreLocationDeleteMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		long storeId = ParamUtil.getLong(actionRequest, "storeId");
		StoreInformation store = StoreInformationLocalServiceUtil.deleteStoreInformation(storeId);
		deleteEntry(StoreInformation.class.getName(), store);
	}
	
	public static void deleteEntry(String className, StoreInformation store){
		final Indexer indexer = IndexerRegistryUtil.getIndexer(className);
		try{
			StoreLocationIndexer storeLocationIndexer = new StoreLocationIndexer();
			indexer.delete(store);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}