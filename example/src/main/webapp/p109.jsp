<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%
// This is a comment
String name = "Fulano de Tal";
int age = 23;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- This is a JSP comment --%>
	<h1>p109.jsp</h1>
	<p>私の名前は<%= name %>、年齢は<%= age %>歳です。</p>
	<% for (int i = 0; i < 5; i++) { %>
		<p>こんにちは</p>
	<% 	} %>
	<%= new Random().nextInt(4) %>
<!-- This is an HTML comment -->
</body>
</html>