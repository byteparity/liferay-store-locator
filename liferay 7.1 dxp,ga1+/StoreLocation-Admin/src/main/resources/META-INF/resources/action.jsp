<%@ include file="/init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	StoreInformation storeInformation = (StoreInformation) row.getObject();
%>
<liferay-ui:icon-menu>
	<portlet:actionURL name="/store/delete" var="deleteStoreURL">
		<portlet:param name="storeId" value="<%=String.valueOf(storeInformation.getStoreId())%>" />
		<portlet:param name="mvcActionCommandName" value="/store/delete" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:actionURL>
	<portlet:actionURL var="viewStoreURL">
		<portlet:param name="storeId" value="<%=String.valueOf(storeInformation.getStoreId())%>" />
		<portlet:param name="mvcRenderCommandName" value="/store/edit" />
		<portlet:param name="view" value="detail" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:actionURL>

	<portlet:renderURL var="editStoreURL">
		<portlet:param name="storeId" value="<%=String.valueOf(storeInformation.getStoreId())%>" />
		<portlet:param name="mvcRenderCommandName" value="/store/edit" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="view" message="View" url="<%=viewStoreURL.toString()%>" />
	<liferay-ui:icon image="edit" message="Edit" url="<%=editStoreURL.toString()%>" />
	<liferay-ui:icon-delete image="delete" message="Delete" url="<%=deleteStoreURL.toString()%>" />
</liferay-ui:icon-menu>