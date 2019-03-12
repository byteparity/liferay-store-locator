package com.byteparity.store.location.portlet.action;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.store.location.portlet.portlet.StoreLocationViewPortlet;
import com.byteparity.store.location.portlet.util.SearchCriteria;
import com.byteparity.store.location.portlet.util.SearchResult;
import com.byteparity.store.location.portlet.util.StoreLocationUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		immediate=true,
		property={
			"javax.portlet.name="+StoreLocationViewPortlet.PORTLET_ID,
			"mvc.command.name=getNearbyStoreInformation"
		},
		service=MVCResourceCommand.class
)
public class StoreLocationMVResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {

		double lattitude = ParamUtil.getDouble(resourceRequest, "lattitude");
		double longitude = ParamUtil.getDouble(resourceRequest, "longitude");
		String unit = ParamUtil.getString(resourceRequest, "unit");
		double distance = ParamUtil.getDouble(resourceRequest, "distance");
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		
		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setUnit(unit);
		searchCriteria.setDistance(distance);
		List<SearchResult> searchResults = StoreLocationUtil.getStores(resourceRequest, searchCriteria, lattitude, longitude);
		
		jsonObj.put("lats", lattitude);
		jsonObj.put("lngs", longitude);
		jsonObj.put("storeLocationResult", searchResults);
		
		try {
			resourceResponse.getWriter().println(jsonObj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}	
}
