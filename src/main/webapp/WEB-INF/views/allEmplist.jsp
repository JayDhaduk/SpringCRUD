<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Emp List</title>
</head>
<body>

<c:if test="${!empty employees}">
		<h2>List Employees</h2>
	<table align="center" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
		</tr>
	
	<c:forEach items="${employees}" var="employee">
   <tr>
    <td><c:out value="${employee.empid}"/></td>
    <td><c:out value="${employee.empName}"/></td>
    <td><c:out value="${employee.empAge}"/></td>
    <td><c:out value="${employee.empSalary}"/></td>
    <td><c:out value="${employee.empAddress}"/></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
<c:if test="${empty employees}">
	<h1> No data in Database Please insert the data </h1>
	<h2><a href="add.html">Add Employee</a></h2>
</c:if>
</body>
</html>