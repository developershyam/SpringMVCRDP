<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		<h1><spring:message code="login.title" /></h1>
		<br>
		<h2>
			<spring:message code="login.welcome" /> :${userName}
			<!-- enter value her to print user name -->
		</h2>
		<h3><spring:message code="success.book" /></h3>
		<table>
			<tr>
				<td><spring:message code="book.name" /></td>
				<td>:</td><td>${passengerDetailsVO.name}</td>
			</tr>
			<tr>
				<td><spring:message code="book.from" /></td>
				<td>:</td><td>${passengerDetailsVO.source}</td>
			</tr>
			<tr>
				<td><spring:message code="book.to" /></td>
				<td>:</td><td>${passengerDetailsVO.destination}</td>
			</tr>
			<tr>
				<td><spring:message code="success.date" /></td>
				<td><fmt:formatDate value="${passengerDetailsVO.doj}" pattern="dd/MM/YYYY" /></td>
				
			</tr>
		</table>
	</body>
</html>