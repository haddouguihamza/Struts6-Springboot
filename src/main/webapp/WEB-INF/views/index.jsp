<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome to the Spring Boot + Struts Application</h1>
    <p><a href="<s:url action='hello'/>">Hello World</a></p>
</body>
</html>