<%@page import ="com.byteparity.store.location.portlet.configuration.StoreLocationConfiguration"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<%@ include file="/init.jsp" %>


<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%= true %>" var="configurationRenderURL" />

<%
	StoreLocationConfiguration storeLocationConfiguration = (StoreLocationConfiguration)request.getAttribute(StoreLocationConfiguration.class.getName());
	String googleAPIKey = StringPool.BLANK;
	String enableSearchFilter = StringPool.BLANK;
	if (Validator.isNotNull(storeLocationConfiguration)) {
		googleAPIKey = portletPreferences.getValue("googleAPIKey", storeLocationConfiguration.getGoogleAPIKey());
    	pageContext.setAttribute("googleAPIKey",googleAPIKey);
    	
    	enableSearchFilter = portletPreferences.getValue("enableSearchFilter", storeLocationConfiguration.getLocationSearchFilterEnabled());
    	pageContext.setAttribute("enableSearchFilter",enableSearchFilter);
	}
	
%>

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
    <aui:input name="redirect" type="hidden"  value="<%= configurationRenderURL %>" />
	<div class="container-fluid-1280">
		<div class="card-horizontal main-content-card">
			<div class="row">
				<div class="col-lg-4">
					<aui:fieldset>
						<label for="googleAPIKey"><liferay-ui:message key="google-api-key" /></label>
						<aui:input label="" type="text" required="true" class="form-control" name="googleAPIKey" value="${googleAPIKey}">
							<aui:validator name="maxLength">256</aui:validator>
						</aui:input>
						
						<aui:input helpMessage="searchDistanceToolTip" name="enableSearchFilter" checked="${enableSearchFilter}" label="Enable Search Filter" type="checkbox"></aui:input>
						
				    </aui:fieldset>
				</div>
			</div>
		</div>
	</div>
	<aui:button-row>
        <aui:button type="submit"></aui:button>
    </aui:button-row>
</aui:form>