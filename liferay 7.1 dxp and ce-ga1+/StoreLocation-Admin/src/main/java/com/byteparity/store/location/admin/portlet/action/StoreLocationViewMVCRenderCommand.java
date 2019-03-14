package com.byteparity.store.location.admin.portlet.action;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.byteparity.store.location.admin.portlet.portlet.StoreLocationAdminPortlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + StoreLocationAdminPortlet.PORTLET_ID,
			"mvc.command.name=/",
			"mvc.command.name=/store/view"
		},
		service = MVCRenderCommand.class
)
public class StoreLocationViewMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		return "/view.jsp";
	}

}