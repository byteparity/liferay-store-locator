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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.byteparity.portal.portlet.storelocator.service.http.StoreInformationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.byteparity.portal.portlet.storelocator.service.http.StoreInformationServiceSoap
 * @generated
 */
@ProviderType
public class StoreInformationSoap implements Serializable {
	public static StoreInformationSoap toSoapModel(StoreInformation model) {
		StoreInformationSoap soapModel = new StoreInformationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStoreId(model.getStoreId());
		soapModel.setStoreName(model.getStoreName());
		soapModel.setAddress1(model.getAddress1());
		soapModel.setAddress2(model.getAddress2());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setCountry(model.getCountry());
		soapModel.setZip(model.getZip());
		soapModel.setPhone(model.getPhone());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static StoreInformationSoap[] toSoapModels(StoreInformation[] models) {
		StoreInformationSoap[] soapModels = new StoreInformationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StoreInformationSoap[][] toSoapModels(
		StoreInformation[][] models) {
		StoreInformationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StoreInformationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StoreInformationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StoreInformationSoap[] toSoapModels(
		List<StoreInformation> models) {
		List<StoreInformationSoap> soapModels = new ArrayList<StoreInformationSoap>(models.size());

		for (StoreInformation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StoreInformationSoap[soapModels.size()]);
	}

	public StoreInformationSoap() {
	}

	public long getPrimaryKey() {
		return _storeId;
	}

	public void setPrimaryKey(long pk) {
		setStoreId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStoreId() {
		return _storeId;
	}

	public void setStoreId(long storeId) {
		_storeId = storeId;
	}

	public String getStoreName() {
		return _storeName;
	}

	public void setStoreName(String storeName) {
		_storeName = storeName;
	}

	public String getAddress1() {
		return _address1;
	}

	public void setAddress1(String address1) {
		_address1 = address1;
	}

	public String getAddress2() {
		return _address2;
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getLatitude() {
		return _latitude;
	}

	public void setLatitude(String latitude) {
		_latitude = latitude;
	}

	public String getLongitude() {
		return _longitude;
	}

	public void setLongitude(String longitude) {
		_longitude = longitude;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _storeId;
	private String _storeName;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _country;
	private String _zip;
	private String _phone;
	private String _latitude;
	private String _longitude;
	private long _groupId;
	private long _companyId;
	private long _createdBy;
	private Date _createDate;
	private Date _modifiedDate;
}