<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="register.css">
</head>
<body>

<form method="post" action="/Trainingmanagement/RegisterServlet">
<fieldset>

<legend>
Register
</legend>

<input type="text" name="empId" id="empId" placeholder="Enter Employee ID"><br>
<input type="text" name="name" id="name" placeholder="Enter Name"><br>
<select id="role" name="role" class="select">
<option>admin</option>
<option>employee</option>
<option>ProjectManager</option>
</select><br>
<input type="text" name="email" id="email" placeholder="Enter Email Address"><br>
<input type="password" name="password" id="password" placeholder="Enter password"><br>
<input type="number" name="phoneNo" id="phoneNo" placeholder="Enter phoneNo"><br>

<input type="submit" value="submit">

</fieldset>
<a href="Login.jsp">login</a>
</form>


</body>
</html>