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

package com.byteparity.portal.portlet.storelocator.service;

import aQute.bnd.annotation.ProviderType;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for StoreInformation. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformationLocalServiceUtil
 * @see com.byteparity.portal.portlet.storelocator.service.base.StoreInformationLocalServiceBaseImpl
 * @see com.byteparity.portal.portlet.storelocator.service.impl.StoreInformationLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StoreInformationLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoreInformationLocalServiceUtil} to access the store information local service. Add custom service methods to {@link com.byteparity.portal.portlet.storelocator.service.impl.StoreInformationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the store information to the database. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public StoreInformation addStoreInformation(
		StoreInformation storeInformation);

	/**
	* Creates a new store information with the primary key. Does not add the store information to the database.
	*
	* @param storeId the primary key for the new store information
	* @return the new store information
	*/
	public StoreInformation createStoreInformation(long storeId);

	/**
	* Deletes the store information from the database. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public StoreInformation deleteStoreInformation(
		StoreInformation storeInformation);

	/**
	* Deletes the store information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storeId the primary key of the store information
	* @return the store information that was removed
	* @throws PortalException if a store information with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public StoreInformation deleteStoreInformation(long storeId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StoreInformation fetchStoreInformation(long storeId);

	/**
	* Returns the store information matching the UUID and group.
	*
	* @param uuid the store information's UUID
	* @param groupId the primary key of the group
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StoreInformation fetchStoreInformationByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the store information with the primary key.
	*
	* @param storeId the primary key of the store information
	* @return the store information
	* @throws PortalException if a store information with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StoreInformation getStoreInformation(long storeId)
		throws PortalException;

	/**
	* Returns the store information matching the UUID and group.
	*
	* @param uuid the store information's UUID
	* @param groupId the primary key of the group
	* @return the matching store information
	* @throws PortalException if a matching store information could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StoreInformation getStoreInformationByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	/**
	* Updates the store information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public StoreInformation updateStoreInformation(
		StoreInformation storeInformation);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of store informations.
	*
	* @return the number of store informations
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStoreInformationsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the store informations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.byteparity.portal.portlet.storelocator.model.impl.StoreInformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @return the range of store informations
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StoreInformation> getStoreInformations(int start, int end);

	/**
	* Returns all the store informations matching the UUID and company.
	*
	* @param uuid the UUID of the store informations
	* @param companyId the primary key of the company
	* @return the matching store informations, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StoreInformation> getStoreInformationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of store informations matching the UUID and company.
	*
	* @param uuid the UUID of the store informations
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of store informations
	* @param end the upper bound of the range of store informations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching store informations, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StoreInformation> getStoreInformationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<StoreInformation> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}