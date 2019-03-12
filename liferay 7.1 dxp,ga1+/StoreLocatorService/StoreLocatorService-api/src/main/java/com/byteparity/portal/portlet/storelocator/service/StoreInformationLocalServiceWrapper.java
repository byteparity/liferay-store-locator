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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StoreInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StoreInformationLocalService
 * @generated
 */
@ProviderType
public class StoreInformationLocalServiceWrapper
	implements StoreInformationLocalService,
		ServiceWrapper<StoreInformationLocalService> {
	public StoreInformationLocalServiceWrapper(
		StoreInformationLocalService storeInformationLocalService) {
		_storeInformationLocalService = storeInformationLocalService;
	}

	/**
	* Adds the store information to the database. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was added
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation addStoreInformation(
		com.byteparity.portal.portlet.storelocator.model.StoreInformation storeInformation) {
		return _storeInformationLocalService.addStoreInformation(storeInformation);
	}

	/**
	* Creates a new store information with the primary key. Does not add the store information to the database.
	*
	* @param storeId the primary key for the new store information
	* @return the new store information
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation createStoreInformation(
		long storeId) {
		return _storeInformationLocalService.createStoreInformation(storeId);
	}

	/**
	* Deletes the store information from the database. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was removed
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation deleteStoreInformation(
		com.byteparity.portal.portlet.storelocator.model.StoreInformation storeInformation) {
		return _storeInformationLocalService.deleteStoreInformation(storeInformation);
	}

	/**
	* Deletes the store information with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storeId the primary key of the store information
	* @return the store information that was removed
	* @throws PortalException if a store information with the primary key could not be found
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation deleteStoreInformation(
		long storeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _storeInformationLocalService.deleteStoreInformation(storeId);
	}

	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation fetchStoreInformation(
		long storeId) {
		return _storeInformationLocalService.fetchStoreInformation(storeId);
	}

	/**
	* Returns the store information matching the UUID and group.
	*
	* @param uuid the store information's UUID
	* @param groupId the primary key of the group
	* @return the matching store information, or <code>null</code> if a matching store information could not be found
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation fetchStoreInformationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _storeInformationLocalService.fetchStoreInformationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the store information with the primary key.
	*
	* @param storeId the primary key of the store information
	* @return the store information
	* @throws PortalException if a store information with the primary key could not be found
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation getStoreInformation(
		long storeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _storeInformationLocalService.getStoreInformation(storeId);
	}

	/**
	* Returns the store information matching the UUID and group.
	*
	* @param uuid the store information's UUID
	* @param groupId the primary key of the group
	* @return the matching store information
	* @throws PortalException if a matching store information could not be found
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation getStoreInformationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _storeInformationLocalService.getStoreInformationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the store information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param storeInformation the store information
	* @return the store information that was updated
	*/
	@Override
	public com.byteparity.portal.portlet.storelocator.model.StoreInformation updateStoreInformation(
		com.byteparity.portal.portlet.storelocator.model.StoreInformation storeInformation) {
		return _storeInformationLocalService.updateStoreInformation(storeInformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _storeInformationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _storeInformationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _storeInformationLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _storeInformationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _storeInformationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _storeInformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of store informations.
	*
	* @return the number of store informations
	*/
	@Override
	public int getStoreInformationsCount() {
		return _storeInformationLocalService.getStoreInformationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _storeInformationLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _storeInformationLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _storeInformationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _storeInformationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

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
	@Override
	public java.util.List<com.byteparity.portal.portlet.storelocator.model.StoreInformation> getStoreInformations(
		int start, int end) {
		return _storeInformationLocalService.getStoreInformations(start, end);
	}

	/**
	* Returns all the store informations matching the UUID and company.
	*
	* @param uuid the UUID of the store informations
	* @param companyId the primary key of the company
	* @return the matching store informations, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.byteparity.portal.portlet.storelocator.model.StoreInformation> getStoreInformationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _storeInformationLocalService.getStoreInformationsByUuidAndCompanyId(uuid,
			companyId);
	}

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
	@Override
	public java.util.List<com.byteparity.portal.portlet.storelocator.model.StoreInformation> getStoreInformationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.byteparity.portal.portlet.storelocator.model.StoreInformation> orderByComparator) {
		return _storeInformationLocalService.getStoreInformationsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _storeInformationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _storeInformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public StoreInformationLocalService getWrappedService() {
		return _storeInformationLocalService;
	}

	@Override
	public void setWrappedService(
		StoreInformationLocalService storeInformationLocalService) {
		_storeInformationLocalService = storeInformationLocalService;
	}

	private StoreInformationLocalService _storeInformationLocalService;
}