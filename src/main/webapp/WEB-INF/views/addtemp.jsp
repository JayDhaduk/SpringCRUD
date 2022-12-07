<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring MVC Form Handling</title>
 </head>
 <body>
  <h2>Add Employee Data</h2>
  <form:form method="POST" action="save.html" modelAttribute="empFrm">
      <table>
       <tr>
           <td><form:label path="empid">Employee ID:</form:label></td>
           <td><form:input path="empid" value="${employee.empid}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="empName">Employee Name:</form:label></td>
           <td><form:input path="empName" value="${employee.empName}"/></td>
       </tr>
       <tr>
           <td><form:label path="empAge">Employee Age:</form:label></td>
           <td><form:input path="empAge" value="${employee.empAge}"/></td>
       </tr>
       <tr>
           <td><form:label path="empSalary">Employee Salary:</form:label></td>
           <td><form:input path="empSalary" value="${employee.empSalary}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="empAddress">Employee Address:</form:label></td>
           <td><form:input path="empAddress" value="${employee.empAddress}"/></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
<%--   <c:if test="${!empty employees}">
  <h2>List Employees</h2>
 <table align="left" border="1">
  <tr>
   <th>Employee ID</th>
   <th>Employee Name</th>
   <th>Employee Age</th>
   <th>Employee Salary</th>
   <th>Employee Address</th>
           <th>Actions on Row</th>
  </tr>

  <c:forEach items="${employees}" var="employee">
   <tr>
    <td><c:out value="${employee.id}"/></td>
    <td><c:out value="${employee.name}"/></td>
    <td><c:out value="${employee.age}"/></td>
    <td><c:out value="${employee.salary}"/></td>
    <td><c:out value="${employee.address}"/></td>
    <td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if> --%>
 </body>
</html>
