<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="login.css">
</head>
<body>
<form action="/Trainingmanagement/LoginServlet" method="post">
<fieldset class="fieldset">

<legend>
Login
</legend>

<input type="text" name="emailId" placeholder="Enter email address"><br>
<input type="password" name="password" placeholder="Enter password"><br>
<!-- <select class="text" name="role">
<option>admin</option>
<option>ProjectManager</option>
<option>employee</option>
</select> -->

<input type="submit" value="submit">
<input type="reset" value="reset">

<a href="Register.jsp">New User??</a>
</fieldset>
</form>

</body>
</html>