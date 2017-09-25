<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	</head>
	<body>
		<center>
			<h1><spring:message code="login.title" /></h1><br>
			<h2 align="right"><spring:message code="login.welcome" /> : ${userName} !!!</h2>
			
			<a href="${pageContext.request.contextPath}/bookTickets" >
				<spring:message code="login.registration" />
			</a>
			
		</center>
		
		
	</body>
</html>
