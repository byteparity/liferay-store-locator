package com.byteparity.store.location.admin.portlet.util;

import java.util.List;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class StoreSearchHelper {

	public static List<StoreInformation> getSearchUser(String storeName, String address, String city, String state, String zip,
			boolean andSearch, int start, int end) {
		DynamicQuery dynamicQuery = builUserDynamicQuery(storeName, address, city, state, zip, andSearch);
		return StoreInformationLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
	}

	public static int getSearchUserCount(String storeName, String address, String city, String state,
			String zip, boolean andSearch) {
		DynamicQuery dynamicQuery = builUserDynamicQuery(storeName, address, city, state, zip, andSearch);
		return StoreInformationLocalServiceUtil.dynamicQuery(dynamicQuery).size();
	}
	
	protected static DynamicQuery builUserDynamicQuery(String storeName, String address, String city,
			String state, String zip, boolean andSearch) {
		DynamicQuery dynamicQuery = StoreInformationLocalServiceUtil.dynamicQuery();

		Junction junction = null;
		if (andSearch)
			junction = RestrictionsFactoryUtil.conjunction();
		else
			junction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(storeName)) {
			Property property = PropertyFactoryUtil.forName("storeName");
			String value = (new StringBuilder("%")).append(storeName).append("%").toString();
			junction.add(property.like(value));
		}
		if (Validator.isNotNull(address)) {
			Property property = PropertyFactoryUtil.forName("address1");
			String value = (new StringBuilder("%")).append(address).append("%").toString();
			junction.add(property.like(value));
		}

		if (Validator.isNotNull(city)) {
			Property property = PropertyFactoryUtil.forName("city");
			String value = (new StringBuilder("%")).append(city).append("%").toString();
			junction.add(property.like(value));
		}

		if (Validator.isNotNull(state)) {
			Property property = PropertyFactoryUtil.forName("state");
			String value = (new StringBuilder("%")).append(state).append("%").toString();
			junction.add(property.like(value));
		}
		
		if (Validator.isNotNull(zip)) {
			Property property = PropertyFactoryUtil.forName("zip");
			String value = (new StringBuilder("%")).append(zip).append("%").toString();
			junction.add(property.like(value));
		}

		return dynamicQuery.add(junction);
	}
}
