<%@page import="com.byteparity.store.location.admin.portlet.util.StoreSearchHelper"%>
<%@ include file="/init.jsp" %>

<liferay-ui:error key="storeInformationValidationError" message="store-empty-field-error-message" />
<liferay-ui:error key="storeLocationNonStringException" message="store-non-string-exception-error-message" />
<liferay-ui:error key="storeLocationExcessFieldLimitSizeException" message="store-limit-exceed-exception-error-message" />


<liferay-portlet:renderURL varImpl="storeRecordSearchUrl">
	<portlet:param name="mvcPath" value="/view.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="storeName" value="<%= storeName %>" />
	<portlet:param name="address1" value="<%= address1 %>" />
	<portlet:param name="city" value="<%= city %>" />
	<portlet:param name="state" value="<%= state %>" />
	<portlet:param name="zip" value="<%= zip %>" />
<portlet:param name="mvcPath" value="/view.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="addStoreLocationInfo">
	<portlet:param name="mvcRenderCommandName" value="/store/edit" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:renderURL>

<div class="container portlet-border">
	<a href="<%= addStoreLocationInfo.toString() %>"><liferay-ui:message key="add-store" /></a> &nbsp;&nbsp;&nbsp;&nbsp;
</div>

<%
	List<StoreInformation> storeInformationList = StoreInformationLocalServiceUtil.getStoreInformations(-1, -1);
%>

<aui:form action="<%=storeRecordSearchUrl %>" method="POST" name="storeRecordSearchForm">
	<liferay-ui:search-container delta="5" emptyResultsMessage="No Store Found!!" displayTerms="<%= new DisplayTerms(renderRequest) %>" iteratorURL="<%= iteratorURL %>">
		<liferay-ui:search-form page="/storeSearch.jsp" servletContext="<%= application %>"/>
	    <liferay-ui:search-container-results>
<%

if (isAdvancedSearch) {
	searchContainer.setTotal(StoreSearchHelper.getSearchUserCount(storeName, address1, city, state, zip, andOperator));
	searchContainer.setResults(StoreSearchHelper.getSearchUser(storeName, address1, city, state, zip, andOperator, searchContainer.getStart(), searchContainer.getEnd()));
} else {
	searchContainer.setTotal(StoreSearchHelper.getSearchUserCount(keywords, keywords, keywords, keywords, keywords, false));
	searchContainer.setResults(StoreSearchHelper.getSearchUser(keywords, keywords, keywords, keywords, keywords, false, searchContainer.getStart(), searchContainer.getEnd()));
}

%>
	</liferay-ui:search-container-results>
	    <liferay-ui:search-container-row className="com.byteparity.portal.portlet.storelocator.model.StoreInformation" keyProperty="storeId" modelVar="store">
	        <liferay-ui:search-container-column-text name="store-name" property="storeName" />
	        <liferay-ui:search-container-column-text name="address-1" property="address1"/>
	        <liferay-ui:search-container-column-text name="city" property="city"/>
	        <liferay-ui:search-container-column-text name="state" property="state"/>
	        <liferay-ui:search-container-column-text name="zip" property="zip"/>
	        <liferay-ui:search-container-column-jsp path="/action.jsp" align="right" /> 
	    </liferay-ui:search-container-row>
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>