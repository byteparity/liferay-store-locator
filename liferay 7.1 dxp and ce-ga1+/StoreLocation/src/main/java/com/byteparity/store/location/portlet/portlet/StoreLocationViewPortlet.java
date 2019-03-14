package com.byteparity.store.location.portlet.portlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author Abhishek
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Byteparity",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=StoreLocation View Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"copy-request-parameters="+true
	},
	service = Portlet.class
)
public class StoreLocationViewPortlet extends MVCPortlet{

	public static final String PORTLET_ID = "com_byteparity_store_location_portlet_portlet_StoreLocationViewPortlet";
}
