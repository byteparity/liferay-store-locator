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

package com.byteparity.portal.portlet.storelocator.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the store information service. This utility wraps {@link com.byteparity.portal.portlet.storelocator.service.persistence.impl.StoreInformationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformationPersistence
 * @see com.byteparity.portal.portlet.storelocator.service.persistence.impl.StoreInformationPersistenceImpl
 * @generated
 */
@ProviderType
public class StoreInformationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StoreInformation storeInformation) {
		getPersistence().clearCache(storeInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StoreInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StoreInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StoreInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StoreInformation update(StoreInformation storeInformation) {
		return getPersistence().update(storeInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StoreInformation update(StoreInformation storeInformation,
		ServiceContext serviceContext) {
		return getPersistence().update(storeInformation, serviceContext);
	}

	/**
	* Returns all the store informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching store informations
	*/
	public static List<StoreInformation> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the store informations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @return the range of matching store informations
	*/
	public static List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the store informations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching store informations
	*/
	public static List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the store informations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching store informations
	*/
	public static List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public static StoreInformation findByUuid_First(java.lang.String uuid,
		OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public static StoreInformation findByUuid_Last(java.lang.String uuid,
		OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the store informations before and after the current store information in the ordered set where uuid = &#63;.
	*
	* @param storeId the primary key of the current store information
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next store information
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public static StoreInformation[] findByUuid_PrevAndNext(long storeId,
		java.lang.String uuid,
		OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence()
				   .findByUuid_PrevAndNext(storeId, uuid, orderByComparator);
	}

	/**
	* Removes all the store informations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of store informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching store informations
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchStoreInformationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public static StoreInformation findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the store information where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the store information that was removed
	*/
	public static StoreInformation removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of store informations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching store informations
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the store informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching store informations
	*/
	public static List<StoreInformation> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the store informations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @return the range of matching store informations
	*/
	public static List<StoreInformation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the store informations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching store informations
	*/
	public static List<StoreInformation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the store informations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching store informations
	*/
	public static List<StoreInformation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public static StoreInformation findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public static StoreInformation findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public static StoreInformation fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the store informations before and after the current store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param storeId the primary key of the current store information
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next store information
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public static StoreInformation[] findByUuid_C_PrevAndNext(long storeId,
		java.lang.String uuid, long companyId,
		OrderByComparator<StoreInformation> orderByComparator)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(storeId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the store informations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of store informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching store informations
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the store information in the entity cache if it is enabled.
	*
	* @param storeInformation the store information
	*/
	public static void cacheResult(StoreInformation storeInformation) {
		getPersistence().cacheResult(storeInformation);
	}

	/**
	* Caches the store informations in the entity cache if it is enabled.
	*
	* @param storeInformations the store informations
	*/
	public static void cacheResult(List<StoreInformation> storeInformations) {
		getPersistence().cacheResult(storeInformations);
	}

	/**
	* Creates a new store information with the primary key. Does not add the store information to the database.
	*
	* @param storeId the primary key for the new store information
	* @return the new store information
	*/
	public static StoreInformation create(long storeId) {
		return getPersistence().create(storeId);
	}

	/**
	* Removes the store information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storeId the primary key of the store information
	* @return the store information that was removed
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public static StoreInformation remove(long storeId)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().remove(storeId);
	}

	public static StoreInformation updateImpl(StoreInformation storeInformation) {
		return getPersistence().updateImpl(storeInformation);
	}

	/**
	* Returns the store information with the primary key or throws a {@link NoSuchStoreInformationException} if it could not be found.
	*
	* @param storeId the primary key of the store information
	* @return the store information
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public static StoreInformation findByPrimaryKey(long storeId)
		throws com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException {
		return getPersistence().findByPrimaryKey(storeId);
	}

	/**
	* Returns the store information with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param storeId the primary key of the store information
	* @return the store information, or <code>null</code> if a store information with the primary key could not be found
	*/
	public static StoreInformation fetchByPrimaryKey(long storeId) {
		return getPersistence().fetchByPrimaryKey(storeId);
	}

	public static java.util.Map<java.io.Serializable, StoreInformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the store informations.
	*
	* @return the store informations
	*/
	public static List<StoreInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the store informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @return the range of store informations
	*/
	public static List<StoreInformation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the store informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of store informations
	*/
	public static List<StoreInformation> findAll(int start, int end,
		OrderByComparator<StoreInformation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the store informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of store informations
	*/
	public static List<StoreInformation> findAll(int start, int end,
		OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the store informations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of store informations.
	*
	* @return the number of store informations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static StoreInformationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StoreInformationPersistence, StoreInformationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(StoreInformationPersistence.class);
}