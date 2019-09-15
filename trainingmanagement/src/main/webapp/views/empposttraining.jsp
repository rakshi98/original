<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Post Training</title>
  <meta charset="utf-8">
  <script type="text/javascript" src="../scripts/empposttraining.js"></script>
  <link type="text/css" rel="stylesheet" href="../styles/emphome.css">
  <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>
  </head>
<body>

<header>
<div class="div2">
    <a href="emphome.jsp" class="btn" >Home</a>
    <a href="#" class="btn" >Post Training</a>
	<a href="empviewtraining.jsp" class="btn" >View Training</a>
    <a href="empfeedback.jsp" class="btn" >Feedback</a>
    <a href="empviewnotifications.jsp" class="btn">Notifications</a>
</div>  
</header>

<fieldset>
<legend>Enter training details to post!!</legend>
<form onsubmit="return false">


<label>Employee ID</label>
<input type="text" id="empId" name="empId">

<label>Full Name</label>
<input type="text" id="fullName" name="fullName">

<label>Email Address</label>
<input type="text" id="emailId" name="emailId">

<label>Training Name</label>
<input type="text" id="trainingName" name="trainingName">

<label>Phone Number</label>
<input type="number" id="phoneNumber" name="phoneNumber">

<input type="submit" value="Submit">
<input type="button" value="Cancel">

</form>
</fieldset>


</body>
</html>