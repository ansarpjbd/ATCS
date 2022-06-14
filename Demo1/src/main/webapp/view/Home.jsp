<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.atcs.demo.model.Employee" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Home page</h1>

<!-- Scriptlet -->
<% out.print("i am java code"); %>

<% 

Employee name=(Employee)request.getAttribute("employee");

  out.println((name.getId()));
  out.println((name.getName()));
  out.println((name.getSalary()));
%>

<%=request.getAttribute("key2") %>
</body>
</html>