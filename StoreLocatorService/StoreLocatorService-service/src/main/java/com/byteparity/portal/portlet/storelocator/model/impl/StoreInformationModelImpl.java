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

package com.byteparity.portal.portlet.storelocator.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.model.StoreInformationModel;
import com.byteparity.portal.portlet.storelocator.model.StoreInformationSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StoreInformation service. Represents a row in the &quot;ByteParity_StoreInformation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link StoreInformationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StoreInformationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformationImpl
 * @see StoreInformation
 * @see StoreInformationModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class StoreInformationModelImpl extends BaseModelImpl<StoreInformation>
	implements StoreInformationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a store information model instance should use the {@link StoreInformation} interface instead.
	 */
	public static final String TABLE_NAME = "ByteParity_StoreInformation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "storeId", Types.BIGINT },
			{ "storeName", Types.VARCHAR },
			{ "address1", Types.VARCHAR },
			{ "address2", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "country", Types.VARCHAR },
			{ "zip", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "latitude", Types.VARCHAR },
			{ "longitude", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdBy", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("storeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("storeName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address1", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address2", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zip", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("latitude", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("longitude", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table ByteParity_StoreInformation (uuid_ VARCHAR(75) null,storeId LONG not null primary key,storeName VARCHAR(200) null,address1 VARCHAR(75) null,address2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,country VARCHAR(75) null,zip VARCHAR(8) null,phone VARCHAR(15) null,latitude VARCHAR(50) null,longitude VARCHAR(50) null,groupId LONG,companyId LONG,createdBy LONG,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table ByteParity_StoreInformation";
	public static final String ORDER_BY_JPQL = " ORDER BY storeInformation.storeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ByteParity_StoreInformation.storeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.byteparity.portal.portlet.storelocator.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.byteparity.portal.portlet.storelocator.model.StoreInformation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.byteparity.portal.portlet.storelocator.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.byteparity.portal.portlet.storelocator.model.StoreInformation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.byteparity.portal.portlet.storelocator.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.byteparity.portal.portlet.storelocator.model.StoreInformation"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long STOREID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StoreInformation toModel(StoreInformationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StoreInformation model = new StoreInformationImpl();

		model.setUuid(soapModel.getUuid());
		model.setStoreId(soapModel.getStoreId());
		model.setStoreName(soapModel.getStoreName());
		model.setAddress1(soapModel.getAddress1());
		model.setAddress2(soapModel.getAddress2());
		model.setCity(soapModel.getCity());
		model.setState(soapModel.getState());
		model.setCountry(soapModel.getCountry());
		model.setZip(soapModel.getZip());
		model.setPhone(soapModel.getPhone());
		model.setLatitude(soapModel.getLatitude());
		model.setLongitude(soapModel.getLongitude());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StoreInformation> toModels(
		StoreInformationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StoreInformation> models = new ArrayList<StoreInformation>(soapModels.length);

		for (StoreInformationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.byteparity.portal.portlet.storelocator.service.util.ServiceProps.get(
				"lock.expiration.time.com.byteparity.portal.portlet.storelocator.model.StoreInformation"));

	public StoreInformationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _storeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStoreId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _storeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getStoreId() {
		return _storeId;
	}

	@Override
	public void setStoreId(long storeId) {
		_storeId = storeId;
	}

	@JSON
	@Override
	public String getStoreName() {
		if (_storeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _storeName;
		}
	}

	@Override
	public void setStoreName(String storeName) {
		_storeName = storeName;
	}

	@JSON
	@Override
	public String getAddress1() {
		if (_address1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address1;
		}
	}

	@Override
	public void setAddress1(String address1) {
		_address1 = address1;
	}

	@JSON
	@Override
	public String getAddress2() {
		if (_address2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address2;
		}
	}

	@Override
	public void setAddress2(String address2) {
		_address2 = address2;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return StringPool.BLANK;
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		_zip = zip;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	@Override
	public String getLatitude() {
		if (_latitude == null) {
			return StringPool.BLANK;
		}
		else {
			return _latitude;
		}
	}

	@Override
	public void setLatitude(String latitude) {
		_latitude = latitude;
	}

	@JSON
	@Override
	public String getLongitude() {
		if (_longitude == null) {
			return StringPool.BLANK;
		}
		else {
			return _longitude;
		}
	}

	@Override
	public void setLongitude(String longitude) {
		_longitude = longitude;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				StoreInformation.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			StoreInformation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StoreInformation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StoreInformation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StoreInformationImpl storeInformationImpl = new StoreInformationImpl();

		storeInformationImpl.setUuid(getUuid());
		storeInformationImpl.setStoreId(getStoreId());
		storeInformationImpl.setStoreName(getStoreName());
		storeInformationImpl.setAddress1(getAddress1());
		storeInformationImpl.setAddress2(getAddress2());
		storeInformationImpl.setCity(getCity());
		storeInformationImpl.setState(getState());
		storeInformationImpl.setCountry(getCountry());
		storeInformationImpl.setZip(getZip());
		storeInformationImpl.setPhone(getPhone());
		storeInformationImpl.setLatitude(getLatitude());
		storeInformationImpl.setLongitude(getLongitude());
		storeInformationImpl.setGroupId(getGroupId());
		storeInformationImpl.setCompanyId(getCompanyId());
		storeInformationImpl.setCreatedBy(getCreatedBy());
		storeInformationImpl.setCreateDate(getCreateDate());
		storeInformationImpl.setModifiedDate(getModifiedDate());

		storeInformationImpl.resetOriginalValues();

		return storeInformationImpl;
	}

	@Override
	public int compareTo(StoreInformation storeInformation) {
		long primaryKey = storeInformation.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StoreInformation)) {
			return false;
		}

		StoreInformation storeInformation = (StoreInformation)obj;

		long primaryKey = storeInformation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		StoreInformationModelImpl storeInformationModelImpl = this;

		storeInformationModelImpl._originalUuid = storeInformationModelImpl._uuid;

		storeInformationModelImpl._originalGroupId = storeInformationModelImpl._groupId;

		storeInformationModelImpl._setOriginalGroupId = false;

		storeInformationModelImpl._originalCompanyId = storeInformationModelImpl._companyId;

		storeInformationModelImpl._setOriginalCompanyId = false;

		storeInformationModelImpl._setModifiedDate = false;

		storeInformationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<StoreInformation> toCacheModel() {
		StoreInformationCacheModel storeInformationCacheModel = new StoreInformationCacheModel();

		storeInformationCacheModel.uuid = getUuid();

		String uuid = storeInformationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			storeInformationCacheModel.uuid = null;
		}

		storeInformationCacheModel.storeId = getStoreId();

		storeInformationCacheModel.storeName = getStoreName();

		String storeName = storeInformationCacheModel.storeName;

		if ((storeName != null) && (storeName.length() == 0)) {
			storeInformationCacheModel.storeName = null;
		}

		storeInformationCacheModel.address1 = getAddress1();

		String address1 = storeInformationCacheModel.address1;

		if ((address1 != null) && (address1.length() == 0)) {
			storeInformationCacheModel.address1 = null;
		}

		storeInformationCacheModel.address2 = getAddress2();

		String address2 = storeInformationCacheModel.address2;

		if ((address2 != null) && (address2.length() == 0)) {
			storeInformationCacheModel.address2 = null;
		}

		storeInformationCacheModel.city = getCity();

		String city = storeInformationCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			storeInformationCacheModel.city = null;
		}

		storeInformationCacheModel.state = getState();

		String state = storeInformationCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			storeInformationCacheModel.state = null;
		}

		storeInformationCacheModel.country = getCountry();

		String country = storeInformationCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			storeInformationCacheModel.country = null;
		}

		storeInformationCacheModel.zip = getZip();

		String zip = storeInformationCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			storeInformationCacheModel.zip = null;
		}

		storeInformationCacheModel.phone = getPhone();

		String phone = storeInformationCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			storeInformationCacheModel.phone = null;
		}

		storeInformationCacheModel.latitude = getLatitude();

		String latitude = storeInformationCacheModel.latitude;

		if ((latitude != null) && (latitude.length() == 0)) {
			storeInformationCacheModel.latitude = null;
		}

		storeInformationCacheModel.longitude = getLongitude();

		String longitude = storeInformationCacheModel.longitude;

		if ((longitude != null) && (longitude.length() == 0)) {
			storeInformationCacheModel.longitude = null;
		}

		storeInformationCacheModel.groupId = getGroupId();

		storeInformationCacheModel.companyId = getCompanyId();

		storeInformationCacheModel.createdBy = getCreatedBy();

		Date createDate = getCreateDate();

		if (createDate != null) {
			storeInformationCacheModel.createDate = createDate.getTime();
		}
		else {
			storeInformationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			storeInformationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			storeInformationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return storeInformationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", storeId=");
		sb.append(getStoreId());
		sb.append(", storeName=");
		sb.append(getStoreName());
		sb.append(", address1=");
		sb.append(getAddress1());
		sb.append(", address2=");
		sb.append(getAddress2());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", latitude=");
		sb.append(getLatitude());
		sb.append(", longitude=");
		sb.append(getLongitude());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append(
			"com.byteparity.portal.portlet.storelocator.model.StoreInformation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>storeId</column-name><column-value><![CDATA[");
		sb.append(getStoreId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>storeName</column-name><column-value><![CDATA[");
		sb.append(getStoreName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address1</column-name><column-value><![CDATA[");
		sb.append(getAddress1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address2</column-name><column-value><![CDATA[");
		sb.append(getAddress2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latitude</column-name><column-value><![CDATA[");
		sb.append(getLatitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longitude</column-name><column-value><![CDATA[");
		sb.append(getLongitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = StoreInformation.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			StoreInformation.class
		};
	private String _uuid;
	private String _originalUuid;
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
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _createdBy;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private StoreInformation _escapedModel;
}