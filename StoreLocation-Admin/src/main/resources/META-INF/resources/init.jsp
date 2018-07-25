<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>


<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil"%>
<%@page import="com.byteparity.portal.portlet.storelocator.model.StoreInformation"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>


<link rel="stylesheet" href="<%=request.getContextPath()%>/css/custom.css">

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	String currentURL = portletURL.toString();

	String storeName = ParamUtil.getString(request, "storeName", StringPool.BLANK);
	String address1 = ParamUtil.getString(request, "address1", StringPool.BLANK);
	String city = ParamUtil.getString(request, "city", StringPool.BLANK);
	String state = ParamUtil.getString(request, "state", StringPool.BLANK);
	String phone = ParamUtil.getString(request, "phone", StringPool.BLANK);
	String zip = ParamUtil.getString(request, "zip", StringPool.BLANK);
	boolean isAdvancedSearch = ParamUtil.getBoolean(request, "advancedSearch", Boolean.FALSE);
	boolean andOperator = ParamUtil.getBoolean(request, "andOperator", Boolean.FALSE);
	String keywords = ParamUtil.getString(request, "keywords");
	
%>