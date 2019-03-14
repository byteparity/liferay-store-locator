package com.byteparity.store.location.portlet.action;

import com.byteparity.store.location.portlet.portlet.StoreLocationViewPortlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.petra.string.StringPool;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + StoreLocationViewPortlet.PORTLET_ID,
			"mvc.command.name=/"
		},
		service = MVCRenderCommand.class
)
public class StoreLocatorViewLocationsMVCRenderCommand  implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		PortletPreferences portletPreferences = renderRequest.getPreferences();
		String googleAPIKey = portletPreferences.getValue("googleAPIKey", StringPool.BLANK);
		renderRequest.setAttribute("googleAPIKey", googleAPIKey);
		
		String enableSearchFilter = portletPreferences.getValue("enableSearchFilter", "false");
		renderRequest.setAttribute("enableSearchFilter", enableSearchFilter);
		
		return "/storeView.jsp";
	}
	
}
