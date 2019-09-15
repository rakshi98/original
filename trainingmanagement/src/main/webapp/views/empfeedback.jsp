<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Post Training</title>
  <meta charset="utf-8">
  <script type="text/javascript" src="../scripts/empfeedback.js"></script>
  <link type="text/css" rel="stylesheet" href="../styles/emphome.css">
  <link type="text/css" rel="stylesheet" href="feeedback.css">
 <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>
</head>
<body>

<header>
<div class="div2">
    <a href="emphome.jsp" class="btn" >Home</a>
    <a href="empposttraining.jsp" class="btn" >Post Training</a>
	<a href="empviewtraining.jsp" class="btn" >View Training</a>
    <a href="#" class="btn" >Feedback</a>
    <a href="empviewnotifications.jsp" class="btn">Notifications</a>
</div>  
</header>

<fieldset>
<legend>Enter training details to post!!</legend>
<form onsubmit="return false" >


<label>Employee ID</label>
<input type="text" id="empId" name="empId">

<label>Name</label>
<input type="text" id="empName" name="empName">
<label>Training Name</label>
<input type="text" id="trainingName" name="trainingName">

<label>Comments</label>
<input type="text" id="comments" name="comments">

<input type="submit" value="submit">
<input type="button" value="cancel">

</form>
</fieldset>


</body>
</html>