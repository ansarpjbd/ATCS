<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

Object name=request.getAttribute("key1");

  out.println((String)name);
%>

<%=request.getAttribute("key2") %>
</body>
</html>