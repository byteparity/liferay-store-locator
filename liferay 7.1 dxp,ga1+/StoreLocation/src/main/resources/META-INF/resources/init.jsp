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


<%@page import="com.byteparity.portal.portlet.storelocator.model.StoreInformation"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.byteparity.portal.portlet.storelocator.service.StoreInformationLocalServiceUtil"%>
<%@page import="com.byteparity.portal.portlet.storelocator.model.StoreInformation"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>


<%-- <link rel="stylesheet" href="<%=request.getContextPath()%>/css/custom.css"> --%>
<style><%@include file="/css/custom.css"%></style>

<liferay-theme:defineObjects />

<portlet:defineObjects />