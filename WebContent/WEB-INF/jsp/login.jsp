<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<!-- <link href="./resources/css/booking.css" rel="stylesheet" /> -->
		<!-- <script type="text/javascript" src="./resources/js/booking.js"></script> -->
	</head>
	<body>
		<center>
			<h1><spring:message code="login.title" /></h1>
			<span style="float: right"> 
				<a href="?lang=en"><spring:message code="login.en" /></a> 
				| 
				<a href="?lang=it"><spring:message code="login.it" /></a>
				
			</span>
			<c:if test="${errorMessage != null}">
				<p style="color: red">${errorMessage}</p>
			</c:if>
		</center>
	
		<sf:form modelAttribute="userDetailsVO" action="doLogin" method="POST">
			<center>
				<table>
					<tr>
						<td><spring:message code="login.userName" /> :</td>
						<td><sf:input path="userName" /></td>
					</tr>
					<tr>
						<td><spring:message code="login.password" /> :</td>
						<td><sf:password path="password" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="<spring:message code="login.submit" />" /></td>
						<td><input type="reset" value="<spring:message code="login.cancel" />" /></td>
					</tr>
				</table>
			</center>
		</sf:form>
	</body>
</html>
