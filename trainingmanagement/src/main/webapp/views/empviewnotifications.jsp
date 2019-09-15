<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
    <%@ page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../styles/emphome.css">
<link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>
</head>
<body>


<header>
<div class="div2">
    <a href="emphome.jsp" class="btn" >Home</a>
    <a href="empposttraining.jsp" class="btn" >Post Training</a>
	<a href="empviewtraining.jsp" class="btn" >View Training</a>
    <a href="empfeedback.jsp" class="btn" >Feedback</a>
    <a href="#" class="btn">Notifications</a>
</div>  
</header>

<% HttpSession session1 = request.getSession(); 
;





%>
</body>
</html>