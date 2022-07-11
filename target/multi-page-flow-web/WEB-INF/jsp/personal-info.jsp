<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PersonalInfo</title>
</head>
<body>
	<form:form modelAttribute="openAccountForm"
		action="${pageContext.request.contextPath}/validateAndShowAddressInfo.htm">
		<form:input path="mobileNo" />
		<br />
		<form:input path="emailAddress" />
		<br />
		<input type="submit" value="Next" />
	</form:form>
</body>
</html>