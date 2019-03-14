package com.byteparity.store.location.portlet.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.byteparity.portal.portlet.storelocator.model.StoreInformation;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.search.filter.GeoDistanceFilter;
import com.liferay.portal.kernel.search.geolocation.DistanceUnit;
import com.liferay.portal.kernel.search.geolocation.GeoDistance;
import com.liferay.portal.kernel.search.geolocation.GeoLocationPoint;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class StoreLocationUtil {

	public static List<SearchResult> getStores(PortletRequest portletRequest, SearchCriteria searchCriteria, double currentLocationLat, double currentLocationLng) {

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute("LIFERAY_SHARED_THEME_DISPLAY");
		HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(portletRequest));
		Indexer<StoreInformation> indexer = IndexerRegistryUtil.getIndexer(StoreInformation.class);
		SearchContext searchContext = SearchContextFactory.getInstance(httpReq);
		searchContext.setCompanyId(themeDisplay.getCompanyId());
		String[] entryCalssName = { StoreInformation.class.getName() };
		searchContext.setEntryClassNames(entryCalssName);
		searchContext.setLike(true);

		double latitude = currentLocationLat;
		double longitude = currentLocationLng;
		double distanceValue = searchCriteria.getDistance();
		GeoLocationPoint geoLocationPinPoint = new GeoLocationPoint(latitude, longitude);
		String _unit = StringPool.BLANK;
		if(Validator.isNotNull(searchCriteria) && Validator.isNotNull(searchCriteria.getUnit())){
			if(searchCriteria.getUnit().equalsIgnoreCase("miles")){
				_unit = "miles";
			}else{
				_unit = "kilometer";
			}
		}
		
		BooleanFilter booleanFilter = new BooleanFilter();
		if(currentLocationLat != 0.0 && currentLocationLng != 0.0 && distanceValue != 0.0){
			GeoDistance geoDistance = new GeoDistance(distanceValue, _unit.equalsIgnoreCase("miles") ? DistanceUnit.MILES : DistanceUnit.KILOMETERS);
			GeoDistanceFilter geoDistanceFilter = new GeoDistanceFilter("geoLocation", geoLocationPinPoint, geoDistance);
			booleanFilter.add(geoDistanceFilter);
		}
		
		BooleanQuery booleanQuery = getClassNameQuery(searchContext, StoreInformation.class.getName());
		/*if(Validator.isNotNull(keyword)){
			searchByKeyword(httpReq, themeDisplay, booleanQuery, keyword);;
		}*/

		if(currentLocationLat != 0.0 && currentLocationLng != 0.0 && distanceValue != 0.0){
			booleanQuery.setPreBooleanFilter(booleanFilter);
		}
		
		Map<String, Serializable> attributes = new HashMap();
		attributes.put("searchCriteria", searchCriteria);
		searchContext.setAttributes(attributes);

		List<SearchResult> recordList = new ArrayList();
		try {

			Hits results = SearchEngineUtil.search(searchContext, booleanQuery);
			//   Hits results = indexer.search(searchContext);
			SearchResult result = null;
			for (Document doc : results.getDocs()) {
				result = new SearchResult();
				long storeInfoId = GetterUtil.getLong(doc.get("entryClassPK"));
				result.setStoreId(storeInfoId);
				result.setStoreName(doc.get("storeName"));
				result.setAddress1(doc.get("address1"));
				result.setCity(doc.get("city"));
				result.setState(doc.get("state"));
				result.setCountry(doc.get("country"));
				result.setZip(doc.get("zip"));
				result.setPhone(doc.get("phone"));
				result.setLatitude(doc.get("latitude"));
				result.setLongitude(doc.get("longitude"));
				recordList.add(result);
			}
		} catch (SearchException e) {
			_log.error("Error while fetching records . " + e);
		}
		return recordList;
	}
	
	private static BooleanQuery getClassNameQuery(SearchContext searchContext, String className){
		BooleanQuery entryClassNameQuery = getBooleanQuery(searchContext);
		BooleanQuery classNameQuery = getBooleanQuery(searchContext);

		try {
			classNameQuery.addTerm(Field.ENTRY_CLASS_NAME, className);
			entryClassNameQuery.add(classNameQuery, BooleanClauseOccur.MUST);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return entryClassNameQuery;
	}
	
	private static BooleanQuery getBooleanQuery(SearchContext searchContext){	
		BooleanQuery booleanQuery = BooleanQueryFactoryUtil.create(searchContext);
		return booleanQuery;
	}
	
	private static Log _log = LogFactoryUtil.getLog(StoreLocationUtil.class);
}
