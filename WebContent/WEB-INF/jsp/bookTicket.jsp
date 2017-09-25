<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet"
			href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
		<style type="text/css">
			.error {
				color: red;
				font-style: italic;
		}
		</style>
		<script>
			$(function() {
				$("#doj").datepicker({ dateFormat: 'dd/mm/yy' }).val();
			});
		</script>
	</head>
	
	<body>
		<h1>
			<spring:message code="login.title" />
		</h1>
		<br>
		<h2>
			<spring:message code="login.welcome" /> :${userName}
			<!-- enter value her to print user name -->
		</h2>
		<br>
		<h3>
			<spring:message code="book.details" />
		</h3>
	
		<sf:form modelAttribute="passengerDetailsVO" action="bookTicketOnline"
			method="POST">
			<table>
				<tr>
					<td><spring:message code="book.name" />:</td>
					<td><sf:input path="name" /></td>
					<td><sf:errors path="name" cssClass="error" /></td>
	
				</tr>
				<tr>
					<td><spring:message code="book.phone" /></td>
					<td><sf:input path="phoneNumber" /></td>
					<td><sf:errors path="phoneNumber" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.from" /></td>
					<td><sf:select path="source">
							<sf:options items="${cityList}" />
						</sf:select></td>
					<td><sf:errors path="source" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.to" /></td>
					<td><sf:select path="destination">
							<sf:options items="${cityList}" />
						</sf:select></td>
					<td><sf:errors path="destination" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.date" /></td>
					<td><sf:input path="doj" /></td>
					<td><sf:errors path="doj" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.gender" /></td>
					<td><sf:radiobuttons path="gender" items="${genderList}" /></td>
					<td><sf:errors path="gender" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.card" /></td>
					<td><sf:input path="cardNumber" /></td>
					<td><sf:errors path="cardNumber" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="book.card.pin" /></td>
					<td><sf:input path="pinNumber" /></td>
					<td><sf:errors path="pinNumber" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2"><sf:checkbox path="agreed"
							title="I understand terms and conditions." /> <spring:message
							code="book.tac" /></td>
					<td><sf:errors path="agreed" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit"
						value='<spring:message code="login.registration" />' /></td>
					<td><input type="reset"
						value='<spring:message code="login.cancel" />' /></td>
				</tr>
			</table>
		</sf:form>
	</body>
</html>