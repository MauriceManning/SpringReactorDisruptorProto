<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="insight" uri="http://static.springsource.com/tags/insight" %>

<c:if test="${not empty timeZone}">
	<fmt:setTimeZone value="${timeZone}" />
</c:if>

<div class="page-module login">
	<div class="page-module-header">
		<h2 class="login_header">Login to Insight</h2>  
	</div>
	<div class="page-module-body overflow_visible">
		<insight:render view="loginForm">
			<spring:url value="/login/authenticate" var="url" />
			<form action="${fn:escapeXml(url)}" method="post" id="login-form">
			<c:if test="${not empty sessionScope['SPRING_SECURITY_LAST_EXCEPTION']}">
				<div class="error error_icon">${fn:escapeXml(sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message)}.</div>
			</c:if>
        
        <label for="login-username" class="title">Username </label>  
        <input type="text" id="login-username" name="j_username" value="${fn:escapeXml(sessionScope['SPRING_SECURITY_LAST_USERNAME'])}" />				
				
				<label for="login-password" class="title">Password</label>
				<input type="password" id="login-password" name="j_password" />
				
				<input type="submit" value="Login" class='button awesome' />
				
				<c:if test="${not empty param.redirect}">
					<input type="hidden" name="redirect" value="${fn:escapeXml(param.redirect)}" id="login-redirect" />
				</c:if>
			</form>
			<%-- Clear out session scoped attributes, don't leak info --%>
			<c:if test="${not empty sessionScope['SPRING_SECURITY_LAST_EXCEPTION']}">
				<c:set scope="session" var="SPRING_SECURITY_LAST_EXCEPTION" value="${null}" />
			</c:if>
			<c:if test="${not empty sessionScope['SPRING_SECURITY_LAST_USERNAME']}">
				<c:set scope="session" var="SPRING_SECURITY_LAST_USERNAME" value="${null}" />
			</c:if>
		</insight:render>
	</div>
</div>

<script type="text/javascript">
	dojo.addOnLoad(function() {
		if (dojo.byId("login-redirect")) { return; }
		var url = window.location.toString(),
			base = Insight.buildUri("").build(),
			path = url.substring(url.indexOf(base) + base.length);
		if (path.indexOf("/login") !== 0) {
			dojo.create("input", { type: "hidden", name: "redirect", value: path }, "login-form");
		}
	});
</script>
