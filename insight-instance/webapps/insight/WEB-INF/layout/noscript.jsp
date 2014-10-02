<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${not empty timeZone}">
	<fmt:setTimeZone value="${timeZone}" />
</c:if>

<div class="page-module">
	<div class="page-module-header">
		<h2 id="noscript-title">D'OH</h2>
		<ul class="controls">
			<spring:url value="/static-{versionNumber}/dojo/dijit/themes/tundra/images/tabClose.png" var="url">
				<spring:param name="versionNumber" value="${versionNumber}" />
			</spring:url>
			<li class="control"><a href="javascript:Insight.suppressWarning()" id="noscript-ignore" style="display: none; margin: 2px"><img src="${fn:escapeXml(url)}" alt="close" /></a></li>
		</ul>
	</div>
	<div class="page-module-body">
		<p id="noscript-warning">JavaScript support is required to use Spring Insight. Please enable JavaScript or upgrade your browser.</p>
		<div id="noscript-upgrade" style="margin-top: 1em;">
			<h2>Recommended Browsers</h2>
			<table width="80%" align="center" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td align="center" valign="top">
						<a href="http://www.google.com/chrome">
							<div class="browser_logo sprite-browser_logo_chrome" alt="Chrome logo"></div>
						</a>
						<br /><a href="http://www.google.com/chrome">Google Chrome</a>
					</td>
					<td align="center" valign="top">
						<a href="http://www.apple.com/safari/">
							<div class="browser_logo sprite-browser_logo_safari" alt="Safari logo"></div>
						</a>
						<br /><a href="http://www.apple.com/safari/">Safari 5</a>
						<br /><span class="example">...or later</span>
					</td>
					<td align="center" valign="top">
						<a href="http://www.getfirefox.com/">
							<div class="browser_logo sprite-browser_logo_firefox" alt="Firefox logo"></div>
						</a>
						<br /><a href="http://www.getfirefox.com/">Mozilla Firefox 3.6</a>
						<br /><span class="example">...or later</span>
					</td>
					<td align="center" valign="top">
						<a href="http://www.springsource.com/products/sts">
							<div class="browser_logo sprite-browser_logo_sts" alt="STS logo"></div>
						</a>
						<br /><a href="http://www.springsource.com/products/sts">SpringSource Tool Suite</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
