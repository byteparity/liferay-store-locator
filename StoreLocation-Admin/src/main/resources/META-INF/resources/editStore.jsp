<%@ include file="/init.jsp" %>
  
<portlet:actionURL name="/store/submit" var="addEditStore">
	<portlet:param name="mvcActionCommandName" value="/store/submit" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>

<portlet:renderURL var="viewStoreLocationInfo">
	<portlet:param name="mvcRenderCommandName" value="/store/view" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:renderURL>

<div class="container">
<div class="row">
<div class="col-sm-8 col-lg-12 edit_store_locatore">
<!-- Add/Edit Store Locator Form -->
<aui:form method="post" action="<%= addEditStore %>" name="editStoreLocatorForm">
	
	<aui:input type="hidden" name="storeId" value="${store.storeId}" />

	<div class="form-group store_name_field">
		<label for="storeName"><liferay-ui:message key="store-name" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="storeName" value="${store.storeName}">
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</div>
	
	<c:if test = "${empty viewDetail}">
		<div class="form-group area_field">
			<!-- <label for="storeArea"><liferay-ui:message key="area" /></label> -->
			<aui:input label="Area" type="text" Stclass="form-control" name="storeArea" value="" helpMessage="areaToolTip">
			</aui:input>
		</div>
	</c:if>
	
	<div class="form-group">
		<label for="address1"><liferay-ui:message key="address-1" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="address1" value="${store.address1}">
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</div>
	
	<%-- <div class="form-group">
		<label for="address2"><liferay-ui:message key="address-2" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" class="form-control" name="address2" value="${store.address2}" />
	</div> --%>
	
	<div class="form-group">
		<label for="city"><liferay-ui:message key="city" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="city" value="${store.city}">
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</div>
	
	<div class="form-group">
		<label for="state"><liferay-ui:message key="state" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="state" value="${store.state}">
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</div>
	
	<div class="form-group">
		<label for="country"><liferay-ui:message key="country" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="country" value="${store.country}">
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</div>
	
	<div class="form-group">
		<label for="zip"><liferay-ui:message key="zip" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="zip" value="${store.zip}">
			<aui:validator name="maxLength">10</aui:validator>
			<aui:validator name="digits"></aui:validator>
		</aui:input>
	</div>
	<div class="form-group">
		<label for="phone"><liferay-ui:message key="phone" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="phone" value="${store.phone}">
			<aui:validator name="maxLength">12</aui:validator>
			<aui:validator name="digits"></aui:validator>
		</aui:input>
	</div>
	
	<div class="form-group">
		<label for="latitude"><liferay-ui:message key="latitude" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="latitude" value="${store.latitude}">
			<aui:validator name="number"></aui:validator>
		</aui:input>
	</div>
	
	<div class="form-group">
		<label for="longitude"><liferay-ui:message key="longitude" /></label>
		<aui:input label="" disabled="${not empty viewDetail ? true : false }" type="text" required="true" class="form-control" name="longitude" value="${store.longitude}">
			<aui:validator name="number"></aui:validator>
		</aui:input>
	</div>
		
	<div class="form-group">
		<!-- Button -->
  	    <div class="col-sm-12 controls">
  	    <c:if test = "${empty viewDetail}">
			<aui:button type="submit" name="submit" value="submit" />
		</c:if>
		<aui:button type="cancel" onClick="<%= viewStoreLocationInfo %>" />
        	<!-- <a href="/group/guest/store-locator" class="btn btn-primary">Cancel</a> -->
       	</div>
   	</div>
</aui:form>

</div>
</div>
</div>
 <%@ include file="editStore_js.jsp" %>
<script src="https://maps.googleapis.com/maps/api/js?key=${googleAPIKey}&libraries=places&callback=initMap" async defer></script>