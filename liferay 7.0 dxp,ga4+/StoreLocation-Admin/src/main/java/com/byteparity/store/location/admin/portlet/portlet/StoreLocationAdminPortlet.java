package com.byteparity.store.location.admin.portlet.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author baps
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Byteparity",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=StoreLocation Admin Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StoreLocationAdminPortlet extends MVCPortlet {
	
	public static final String PORTLET_ID = "com_byteparity_store_location_admin_portlet_portlet_StoreLocationAdminPortlet";
	
}