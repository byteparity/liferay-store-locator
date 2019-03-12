package com.byteparity.store.location.portlet.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "com.byteparity.store.location.portlet.configuration.StoreLocationConfiguration")
public interface StoreLocationConfiguration {

	@Meta.AD(required = false)
    public String getGoogleAPIKey();
	
	@Meta.AD(required = false)
    public String getLocationSearchFilterEnabled();
	
}