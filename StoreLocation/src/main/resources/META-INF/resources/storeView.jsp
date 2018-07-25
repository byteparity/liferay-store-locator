<%@page import="com.liferay.portal.kernel.model.PortletPreferences"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<script src="<%=request.getContextPath()%>/js/jquery.custom-scrollbar.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.custom-scrollbar.css">

<div class="view_store_search">
	
	<c:if test="${enableSearchFilter}">
		<aui:form name="searchStoreLocationForm">
			<aui:select name="distanceUnit" label="Select Distance Unit">
				<aui:option value="kilometer"><liferay-ui:message key="kilometer" /></aui:option>
				<aui:option value="miles"><liferay-ui:message key="miles" /></aui:option>
			</aui:select>
			
			<aui:input id="distance" name="distance" label="Distance" helpMessage="storeSearchToolTip" >
				<aui:validator name="digits"></aui:validator>
			</aui:input>
			
			<button  class="btn btn-primary" type="button" onclick="<portlet:namespace />getNearbyStoreLocation()"><liferay-ui:message key="submit" /></button>
		</aui:form>
	</c:if>
	<div class="clearfix"></div>
	<div class="container">
		<div id="noRecords" style="display:none"><liferay-ui:message key="no-records-found" /></div>
		<div class="row"><label id="noOfRecords"> </label> </div>
	</div>
	<div class="row default-skin" id="addressInformation"></div>

	<div id="map"></div>
</div>
<%@ include file="storeView_js.jsp" %>
<script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js"></script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=${googleAPIKey}&callback=initMap"></script>