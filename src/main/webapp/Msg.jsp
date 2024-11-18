<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  h1
  {  
     display:flex;
     align-items:center;
     justify-content:center;
     color:white;
    
  }
</style>
</head>
<body>
 <%
     String msg=(String)request.getAttribute("msg");
     out.print("<h1>"+msg+"</h1>");
 %>
  <%@include file="SignUp.html"%>
</body>
</html>