package com.byteparity.store.location.admin.portlet.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil;
import com.byteparity.store.location.admin.portlet.portlet.StoreLocationAdminPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(immediate=true, service={Indexer.class})
public class StoreLocationIndexer extends BaseIndexer<StoreInformation>{

	private static final Log _log = LogFactoryUtil.getLog(StoreLocationIndexer.class);
	public static final String CLASS_NAMES = StoreInformation.class.getName();
	public static final String PORTLET_ID = StoreLocationAdminPortlet.PORTLET_ID;
	
	@Reference
	IndexWriterHelper indexWriterHelper;

	public StoreLocationIndexer() {
		setDefaultSelectedFieldNames(new String[] { "companyId", "entryClassPK", "storeName", "personName", "address1", "city", "state", "country", "zip","phone", "latitude", "longitude"});
		setPermissionAware(false);
		setFilterSearch(false);
	}
	
	@Override
	public String getClassName() {
		return CLASS_NAMES;
	}

	@Override
	public void postProcessContextBooleanFilter(BooleanFilter contextBooleanFilter, SearchContext searchContext) throws Exception {
		addStatus(contextBooleanFilter, searchContext);
	}
	
	@Override
	  public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter fullQueryBooleanFilter, SearchContext searchContext) throws Exception {
		  SearchCriteria searchCriteria = (SearchCriteria)searchContext.getAttribute("searchCriteria");
	      if (Validator.isNotNull(searchCriteria.getStoreName())) {
	    	  searchQuery.addRequiredTerm("storeName", searchCriteria.getStoreName());
		  }
	      if (Validator.isNotNull(searchCriteria.getAddress1())) {
	    	  searchQuery.addRequiredTerm("address1", searchCriteria.getAddress1());
		  }
	      if (Validator.isNotNull(searchCriteria.getCity())) {
	    	  searchQuery.addRequiredTerm("city", searchCriteria.getCity());
		  }
	      if(Validator.isNotNull(searchCriteria.getState())){
	    	  searchQuery.addRequiredTerm("state", searchCriteria.getState());
	      }
	      if(Validator.isNotNull(searchCriteria.getCountry())){
	    	  searchQuery.addRequiredTerm("country", searchCriteria.getCountry());
	      }
	      if(Validator.isNotNull(searchCriteria.getZip())){
	    	  searchQuery.addRequiredTerm("zip", searchCriteria.getZip());
	      }
	      if(Validator.isNotNull(searchCriteria.getPhone())){
	    	  searchQuery.addRequiredTerm("phone", searchCriteria.getPhone());
	      }
	      if(Validator.isNotNull(searchCriteria.getLatitude())){
	    	  searchQuery.addRequiredTerm("latitude", searchCriteria.getLatitude());
	      }
	      if(Validator.isNotNull(searchCriteria.getLongitude())){
	    	  searchQuery.addRequiredTerm("longitude", searchCriteria.getLongitude());
	      }
	      if(Validator.isNotNull(searchCriteria.getLatitude()) && Validator.isNotNull(searchCriteria.getLongitude())){
	    	  addSearchTerm(searchQuery, searchContext, "geoLocation", false);
	      }
	  }
	
	@Override
	protected void doDelete(StoreInformation storeInformation) throws Exception {
		Document document = new DocumentImpl();
		document.addUID(PORTLET_ID, storeInformation.getStoreId());
		SearchEngineUtil.deleteDocument(getSearchEngineId(), storeInformation.getCompanyId(), document.get(Field.UID));
	}
	
	@Override
	protected Document doGetDocument(StoreInformation store) throws Exception {

		Document document = getBaseModelDocument(CLASS_NAMES, store);

		document.addUID(PORTLET_ID, store.getStoreId());
		document.addKeyword("companyId", store.getCompanyId());
		document.addKeyword("groupId", store.getGroupId());
		document.addKeyword("scopeGroupId", store.getGroupId());
		document.addKeyword("entryClassName", StoreInformation.class.getName());
		document.addKeyword("storeId", store.getStoreId());
		document.addKeyword("storeName", store.getStoreName());
		document.addText("address1", store.getAddress1());
		document.addText("city", store.getCity());
		document.addText("state", store.getState());
		document.addText("country", store.getCountry());
		document.addText("zip", store.getZip());
		document.addText("phone", store.getPhone());
		document.addText("latitude", store.getLatitude());
		document.addText("longitude", store.getLongitude());
		document.addGeoLocation(Double.parseDouble(store.getLatitude()), Double.parseDouble(store.getLongitude()));
		return document;
	}
	
	public static final Accessor<String, String> ACCESSOR = new Accessor() {

		public String get(String courseName)
		{
			return courseName;
		}

		public Class<String> getAttributeClass()
		{
			return String.class;
		}

		public Class<String> getTypeClass()
		{
			return String.class;
		}

		@Override
		public Object get(Object t) {
			// TODO Auto-generated method stub
			return null;
		}

	};
	
	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest, PortletResponse portletResponse)  throws Exception {
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		return summary;
	}
	
	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		_log.info("Reindexing StoreInformation id " + classPK);
		StoreInformation store = StoreInformationLocalServiceUtil.getStoreInformation(classPK);
		doReindex(store);
	}
	
	@Override
	protected void doReindex(String[] ids) throws Exception {

		long companyId = GetterUtil.getLong(ids[0]); 
		_log.info("Reindex all Store objects " + companyId);

		List<StoreInformation> stores = StoreInformationLocalServiceUtil.getStoreInformations(-1, -1); 
		if (stores.isEmpty()) {
			return; 
		}

		Collection<Document> documents = new ArrayList();
		for (StoreInformation store : stores) {
			Document doc = getDocument(StoreInformationLocalServiceUtil.getStoreInformation(store.getStoreId()));
			documents.add(doc);
		}
		this.indexWriterHelper.updateDocuments(getSearchEngineId(), companyId, documents, isCommitImmediately());
	}

	@Override
	protected void doReindex(StoreInformation store) throws Exception {
		Document document = getDocument(store);
		this.indexWriterHelper.updateDocument(getSearchEngineId(), store.getCompanyId(), document, isCommitImmediately());
	}
}
