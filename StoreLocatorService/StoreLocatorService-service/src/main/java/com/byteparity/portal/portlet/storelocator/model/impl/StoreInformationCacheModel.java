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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StoreInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformation
 * @generated
 */
@ProviderType
public class StoreInformationCacheModel implements CacheModel<StoreInformation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StoreInformationCacheModel)) {
			return false;
		}

		StoreInformationCacheModel storeInformationCacheModel = (StoreInformationCacheModel)obj;

		if (storeId == storeInformationCacheModel.storeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, storeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", storeId=");
		sb.append(storeId);
		sb.append(", storeName=");
		sb.append(storeName);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", country=");
		sb.append(country);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StoreInformation toEntityModel() {
		StoreInformationImpl storeInformationImpl = new StoreInformationImpl();

		if (uuid == null) {
			storeInformationImpl.setUuid(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setUuid(uuid);
		}

		storeInformationImpl.setStoreId(storeId);

		if (storeName == null) {
			storeInformationImpl.setStoreName(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setStoreName(storeName);
		}

		if (address1 == null) {
			storeInformationImpl.setAddress1(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setAddress1(address1);
		}

		if (address2 == null) {
			storeInformationImpl.setAddress2(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setAddress2(address2);
		}

		if (city == null) {
			storeInformationImpl.setCity(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setCity(city);
		}

		if (state == null) {
			storeInformationImpl.setState(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setState(state);
		}

		if (country == null) {
			storeInformationImpl.setCountry(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setCountry(country);
		}

		if (zip == null) {
			storeInformationImpl.setZip(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setZip(zip);
		}

		if (phone == null) {
			storeInformationImpl.setPhone(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setPhone(phone);
		}

		if (latitude == null) {
			storeInformationImpl.setLatitude(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setLatitude(latitude);
		}

		if (longitude == null) {
			storeInformationImpl.setLongitude(StringPool.BLANK);
		}
		else {
			storeInformationImpl.setLongitude(longitude);
		}

		storeInformationImpl.setGroupId(groupId);
		storeInformationImpl.setCompanyId(companyId);
		storeInformationImpl.setCreatedBy(createdBy);

		if (createDate == Long.MIN_VALUE) {
			storeInformationImpl.setCreateDate(null);
		}
		else {
			storeInformationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			storeInformationImpl.setModifiedDate(null);
		}
		else {
			storeInformationImpl.setModifiedDate(new Date(modifiedDate));
		}

		storeInformationImpl.resetOriginalValues();

		return storeInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		storeId = objectInput.readLong();
		storeName = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		country = objectInput.readUTF();
		zip = objectInput.readUTF();
		phone = objectInput.readUTF();
		latitude = objectInput.readUTF();
		longitude = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		createdBy = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(storeId);

		if (storeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(storeName);
		}

		if (address1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (country == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (zip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (latitude == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(latitude);
		}

		if (longitude == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(longitude);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long storeId;
	public String storeName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String country;
	public String zip;
	public String phone;
	public String latitude;
	public String longitude;
	public long groupId;
	public long companyId;
	public long createdBy;
	public long createDate;
	public long modifiedDate;
}