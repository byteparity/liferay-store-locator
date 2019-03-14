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

import com.byteparity.portal.portlet.storelocator.exception.NoSuchStoreInformationException;
import com.byteparity.portal.portlet.storelocator.model.StoreInformation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the store information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.byteparity.portal.portlet.storelocator.service.persistence.impl.StoreInformationPersistenceImpl
 * @see StoreInformationUtil
 * @generated
 */
@ProviderType
public interface StoreInformationPersistence extends BasePersistence<StoreInformation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoreInformationUtil} to access the store information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the store informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching store informations
	*/
	public java.util.List<StoreInformation> findByUuid(java.lang.String uuid);

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
	public java.util.List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

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
	public java.util.List<StoreInformation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public StoreInformation findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Returns the first store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

	/**
	* Returns the last store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public StoreInformation findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Returns the last store information in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

	/**
	* Returns the store informations before and after the current store information in the ordered set where uuid = &#63;.
	*
	* @param storeId the primary key of the current store information
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next store information
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public StoreInformation[] findByUuid_PrevAndNext(long storeId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Removes all the store informations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of store informations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching store informations
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchStoreInformationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public StoreInformation findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchStoreInformationException;

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the store information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the store information where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the store information that was removed
	*/
	public StoreInformation removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchStoreInformationException;

	/**
	* Returns the number of store informations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching store informations
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the store informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching store informations
	*/
	public java.util.List<StoreInformation> findByUuid_C(
		java.lang.String uuid, long companyId);

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
	public java.util.List<StoreInformation> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

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
	public java.util.List<StoreInformation> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

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
	public java.util.List<StoreInformation> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public StoreInformation findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Returns the first store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

	/**
	* Returns the last store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information
	* @throws NoSuchStoreInformationException if a matching store information could not be found
	*/
	public StoreInformation findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Returns the last store information in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching store information, or <code>null</code> if a matching store information could not be found
	*/
	public StoreInformation fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

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
	public StoreInformation[] findByUuid_C_PrevAndNext(long storeId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator)
		throws NoSuchStoreInformationException;

	/**
	* Removes all the store informations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of store informations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching store informations
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the store information in the entity cache if it is enabled.
	*
	* @param storeInformation the store information
	*/
	public void cacheResult(StoreInformation storeInformation);

	/**
	* Caches the store informations in the entity cache if it is enabled.
	*
	* @param storeInformations the store informations
	*/
	public void cacheResult(java.util.List<StoreInformation> storeInformations);

	/**
	* Creates a new store information with the primary key. Does not add the store information to the database.
	*
	* @param storeId the primary key for the new store information
	* @return the new store information
	*/
	public StoreInformation create(long storeId);

	/**
	* Removes the store information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storeId the primary key of the store information
	* @return the store information that was removed
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public StoreInformation remove(long storeId)
		throws NoSuchStoreInformationException;

	public StoreInformation updateImpl(StoreInformation storeInformation);

	/**
	* Returns the store information with the primary key or throws a {@link NoSuchStoreInformationException} if it could not be found.
	*
	* @param storeId the primary key of the store information
	* @return the store information
	* @throws NoSuchStoreInformationException if a store information with the primary key could not be found
	*/
	public StoreInformation findByPrimaryKey(long storeId)
		throws NoSuchStoreInformationException;

	/**
	* Returns the store information with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param storeId the primary key of the store information
	* @return the store information, or <code>null</code> if a store information with the primary key could not be found
	*/
	public StoreInformation fetchByPrimaryKey(long storeId);

	@Override
	public java.util.Map<java.io.Serializable, StoreInformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the store informations.
	*
	* @return the store informations
	*/
	public java.util.List<StoreInformation> findAll();

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
	public java.util.List<StoreInformation> findAll(int start, int end);

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
	public java.util.List<StoreInformation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator);

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
	public java.util.List<StoreInformation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StoreInformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the store informations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of store informations.
	*
	* @return the number of store informations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}