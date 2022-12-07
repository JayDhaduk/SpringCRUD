<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring-MVC DEMO</title>
 </head>
 <body>
  <h2>Add Employee Data</h2>
  
	<form:form method="POST" action="save.html"  modelAttribute="empFrm">
      <table>
       <tr>
           <td><form:label path="empid" >Employee ID:</form:label></td>
           <td><form:input path="empid"  readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="empName">Employee Name:</form:label></td>
           <td><form:input path="empName" /></td>
       </tr>
       <tr>
           <td><form:label path="empAge">Employee Age:</form:label></td>
           <td><form:input path="empAge" /></td>
       </tr>
       <tr>
           <td><form:label path="empSalary">Employee Salary:</form:label></td>
           <td><form:input path="empSalary" /></td>
       </tr>
       
       <tr>
           <td><form:label path="empAddress">Employee Address:</form:label></td>
           <td><form:input path="empAddress" /></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
 
<c:if test="${!empty employees}">
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
    <td><c:out value="${employee.empid}"/></td>
    <td><c:out value="${employee.empName}"/></td>
    <td><c:out value="${employee.empAge}"/></td>
    <td><c:out value="${employee.empSalary}"/></td>
    <td><c:out value="${employee.empAddress}"/></td>
    <td align="center"><a href="edit.html?id=${employee.empid}">Edit</a> | 
    				   <a href="delete.html?id=${employee.empid}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>

 </body>
</html>