<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.Fruit" %>
<% Fruit fruit = (Fruit) request.getAttribute("fruit"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習問題7.6</title>
</head>
<body>
<p>
<%= fruit.getName() %>の値段は<%= fruit.getPrice() %>です。
</p>
</body>
</html>