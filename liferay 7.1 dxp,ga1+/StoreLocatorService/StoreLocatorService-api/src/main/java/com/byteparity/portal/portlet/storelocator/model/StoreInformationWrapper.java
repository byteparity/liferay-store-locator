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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link StoreInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformation
 * @generated
 */
@ProviderType
public class StoreInformationWrapper implements StoreInformation,
	ModelWrapper<StoreInformation> {
	public StoreInformationWrapper(StoreInformation storeInformation) {
		_storeInformation = storeInformation;
	}

	@Override
	public Class<?> getModelClass() {
		return StoreInformation.class;
	}

	@Override
	public String getModelClassName() {
		return StoreInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("storeId", getStoreId());
		attributes.put("storeName", getStoreName());
		attributes.put("address1", getAddress1());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("country", getCountry());
		attributes.put("zip", getZip());
		attributes.put("phone", getPhone());
		attributes.put("latitude", getLatitude());
		attributes.put("longitude", getLongitude());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long storeId = (Long)attributes.get("storeId");

		if (storeId != null) {
			setStoreId(storeId);
		}

		String storeName = (String)attributes.get("storeName");

		if (storeName != null) {
			setStoreName(storeName);
		}

		String address1 = (String)attributes.get("address1");

		if (address1 != null) {
			setAddress1(address1);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String latitude = (String)attributes.get("latitude");

		if (latitude != null) {
			setLatitude(latitude);
		}

		String longitude = (String)attributes.get("longitude");

		if (longitude != null) {
			setLongitude(longitude);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public StoreInformation toEscapedModel() {
		return new StoreInformationWrapper(_storeInformation.toEscapedModel());
	}

	@Override
	public StoreInformation toUnescapedModel() {
		return new StoreInformationWrapper(_storeInformation.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _storeInformation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _storeInformation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _storeInformation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _storeInformation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<StoreInformation> toCacheModel() {
		return _storeInformation.toCacheModel();
	}

	@Override
	public int compareTo(StoreInformation storeInformation) {
		return _storeInformation.compareTo(storeInformation);
	}

	@Override
	public int hashCode() {
		return _storeInformation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _storeInformation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StoreInformationWrapper((StoreInformation)_storeInformation.clone());
	}

	/**
	* Returns the address1 of this store information.
	*
	* @return the address1 of this store information
	*/
	@Override
	public java.lang.String getAddress1() {
		return _storeInformation.getAddress1();
	}

	/**
	* Returns the address2 of this store information.
	*
	* @return the address2 of this store information
	*/
	@Override
	public java.lang.String getAddress2() {
		return _storeInformation.getAddress2();
	}

	/**
	* Returns the city of this store information.
	*
	* @return the city of this store information
	*/
	@Override
	public java.lang.String getCity() {
		return _storeInformation.getCity();
	}

	/**
	* Returns the country of this store information.
	*
	* @return the country of this store information
	*/
	@Override
	public java.lang.String getCountry() {
		return _storeInformation.getCountry();
	}

	/**
	* Returns the latitude of this store information.
	*
	* @return the latitude of this store information
	*/
	@Override
	public java.lang.String getLatitude() {
		return _storeInformation.getLatitude();
	}

	/**
	* Returns the longitude of this store information.
	*
	* @return the longitude of this store information
	*/
	@Override
	public java.lang.String getLongitude() {
		return _storeInformation.getLongitude();
	}

	/**
	* Returns the phone of this store information.
	*
	* @return the phone of this store information
	*/
	@Override
	public java.lang.String getPhone() {
		return _storeInformation.getPhone();
	}

	/**
	* Returns the state of this store information.
	*
	* @return the state of this store information
	*/
	@Override
	public java.lang.String getState() {
		return _storeInformation.getState();
	}

	/**
	* Returns the store name of this store information.
	*
	* @return the store name of this store information
	*/
	@Override
	public java.lang.String getStoreName() {
		return _storeInformation.getStoreName();
	}

	/**
	* Returns the uuid of this store information.
	*
	* @return the uuid of this store information
	*/
	@Override
	public java.lang.String getUuid() {
		return _storeInformation.getUuid();
	}

	/**
	* Returns the zip of this store information.
	*
	* @return the zip of this store information
	*/
	@Override
	public java.lang.String getZip() {
		return _storeInformation.getZip();
	}

	@Override
	public java.lang.String toString() {
		return _storeInformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _storeInformation.toXmlString();
	}

	/**
	* Returns the create date of this store information.
	*
	* @return the create date of this store information
	*/
	@Override
	public Date getCreateDate() {
		return _storeInformation.getCreateDate();
	}

	/**
	* Returns the modified date of this store information.
	*
	* @return the modified date of this store information
	*/
	@Override
	public Date getModifiedDate() {
		return _storeInformation.getModifiedDate();
	}

	/**
	* Returns the company ID of this store information.
	*
	* @return the company ID of this store information
	*/
	@Override
	public long getCompanyId() {
		return _storeInformation.getCompanyId();
	}

	/**
	* Returns the created by of this store information.
	*
	* @return the created by of this store information
	*/
	@Override
	public long getCreatedBy() {
		return _storeInformation.getCreatedBy();
	}

	/**
	* Returns the group ID of this store information.
	*
	* @return the group ID of this store information
	*/
	@Override
	public long getGroupId() {
		return _storeInformation.getGroupId();
	}

	/**
	* Returns the primary key of this store information.
	*
	* @return the primary key of this store information
	*/
	@Override
	public long getPrimaryKey() {
		return _storeInformation.getPrimaryKey();
	}

	/**
	* Returns the store ID of this store information.
	*
	* @return the store ID of this store information
	*/
	@Override
	public long getStoreId() {
		return _storeInformation.getStoreId();
	}

	@Override
	public void persist() {
		_storeInformation.persist();
	}

	/**
	* Sets the address1 of this store information.
	*
	* @param address1 the address1 of this store information
	*/
	@Override
	public void setAddress1(java.lang.String address1) {
		_storeInformation.setAddress1(address1);
	}

	/**
	* Sets the address2 of this store information.
	*
	* @param address2 the address2 of this store information
	*/
	@Override
	public void setAddress2(java.lang.String address2) {
		_storeInformation.setAddress2(address2);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_storeInformation.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this store information.
	*
	* @param city the city of this store information
	*/
	@Override
	public void setCity(java.lang.String city) {
		_storeInformation.setCity(city);
	}

	/**
	* Sets the company ID of this store information.
	*
	* @param companyId the company ID of this store information
	*/
	@Override
	public void setCompanyId(long companyId) {
		_storeInformation.setCompanyId(companyId);
	}

	/**
	* Sets the country of this store information.
	*
	* @param country the country of this store information
	*/
	@Override
	public void setCountry(java.lang.String country) {
		_storeInformation.setCountry(country);
	}

	/**
	* Sets the create date of this store information.
	*
	* @param createDate the create date of this store information
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_storeInformation.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this store information.
	*
	* @param createdBy the created by of this store information
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_storeInformation.setCreatedBy(createdBy);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_storeInformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_storeInformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_storeInformation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this store information.
	*
	* @param groupId the group ID of this store information
	*/
	@Override
	public void setGroupId(long groupId) {
		_storeInformation.setGroupId(groupId);
	}

	/**
	* Sets the latitude of this store information.
	*
	* @param latitude the latitude of this store information
	*/
	@Override
	public void setLatitude(java.lang.String latitude) {
		_storeInformation.setLatitude(latitude);
	}

	/**
	* Sets the longitude of this store information.
	*
	* @param longitude the longitude of this store information
	*/
	@Override
	public void setLongitude(java.lang.String longitude) {
		_storeInformation.setLongitude(longitude);
	}

	/**
	* Sets the modified date of this store information.
	*
	* @param modifiedDate the modified date of this store information
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_storeInformation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_storeInformation.setNew(n);
	}

	/**
	* Sets the phone of this store information.
	*
	* @param phone the phone of this store information
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_storeInformation.setPhone(phone);
	}

	/**
	* Sets the primary key of this store information.
	*
	* @param primaryKey the primary key of this store information
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_storeInformation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_storeInformation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state of this store information.
	*
	* @param state the state of this store information
	*/
	@Override
	public void setState(java.lang.String state) {
		_storeInformation.setState(state);
	}

	/**
	* Sets the store ID of this store information.
	*
	* @param storeId the store ID of this store information
	*/
	@Override
	public void setStoreId(long storeId) {
		_storeInformation.setStoreId(storeId);
	}

	/**
	* Sets the store name of this store information.
	*
	* @param storeName the store name of this store information
	*/
	@Override
	public void setStoreName(java.lang.String storeName) {
		_storeInformation.setStoreName(storeName);
	}

	/**
	* Sets the uuid of this store information.
	*
	* @param uuid the uuid of this store information
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_storeInformation.setUuid(uuid);
	}

	/**
	* Sets the zip of this store information.
	*
	* @param zip the zip of this store information
	*/
	@Override
	public void setZip(java.lang.String zip) {
		_storeInformation.setZip(zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StoreInformationWrapper)) {
			return false;
		}

		StoreInformationWrapper storeInformationWrapper = (StoreInformationWrapper)obj;

		if (Objects.equals(_storeInformation,
					storeInformationWrapper._storeInformation)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _storeInformation.getStagedModelType();
	}

	@Override
	public StoreInformation getWrappedModel() {
		return _storeInformation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _storeInformation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _storeInformation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_storeInformation.resetOriginalValues();
	}

	private final StoreInformation _storeInformation;
}