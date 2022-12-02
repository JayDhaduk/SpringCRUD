
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
  <form:form method="POST" action="save.html">
      <table>
       <tr>
           <td><form:label path="id">Employee ID:</form:label></td>
           <td><form:input path="id" value="${employee.empid}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Employee Name:</form:label></td>
           <td><form:input path="name" value="${employee.empName}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">Employee Age:</form:label></td>
           <td><form:input path="age" value="${employee.empAge}"/></td>
       </tr>
       <tr>
           <td><form:label path="salary">Employee Salary:</form:label></td>
           <td><form:input path="salary" value="${employee.empSalary}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="address">Employee Address:</form:label></td>
           <td><form:input path="address" value="${employee.empAddress}"/></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
  <c:if test="${!empty employees}">
  <h2>List Employees</h2>
 <table align="center" border="1">
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
    <td><c:out value="${employee.empid}"/></td>
    <td><c:out value="${employee.empName}"/></td>
    <td><c:out value="${employee.empAge}"/></td>
    <td><c:out value="${employee.empSalary}"/></td>
    <td><c:out value="${employee.empAddress}"/></td>
    <td align="center"><a href="edit.html?id=${employee.empid}">Edit</a> | <a href="delete.html?id=${employee.empid}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>