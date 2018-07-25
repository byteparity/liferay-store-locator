/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.byteparity.portal.portlet.storelocator.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the StoreInformation service. Represents a row in the &quot;ByteParity_StoreInformation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformationModel
 * @see com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationImpl
 * @see com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationModelImpl
 * @generated
 */
@ImplementationClassName("com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationImpl")
@ProviderType
public interface StoreInformation extends StoreInformationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<StoreInformation, Long> STORE_ID_ACCESSOR = new Accessor<StoreInformation, Long>() {
			@Override
			public Long get(StoreInformation storeInformation) {
				return storeInformation.getStoreId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<StoreInformation> getTypeClass() {
				return StoreInformation.class;
			}
		};
}