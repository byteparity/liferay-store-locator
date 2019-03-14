<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@ include file="/init.jsp" %>
<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>

<liferay-ui:search-toggle buttonLabel="Store Search"  displayTerms="<%= displayTerms %>" id="toggle_id_store_search">
	<aui:input label="store-name" name="storeName" value="<%= storeName %>" />
	<aui:input label="address-1" name="address1" value="<%= address1 %>" />
	<aui:input label="city" name="city" value="<%= city %>" />
	<aui:input label="state" name="state" value="<%= state %>" />
	<aui:input label="zip" name="zip" value="<%= zip %>" />
</liferay-ui:search-toggle>