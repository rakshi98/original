<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="../styles/adminscheduletraining.css">
<script type="text/javascript" src="../scripts/adminscheduletraining.js"></script>
<link type="text/css" rel="stylesheet" href="../styles/adminhome.css">
<link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>
</head>
<body>


<header>
<div class="div2">

    <a href="adminhome.jsp" class="btn" >Home</a> 
    <a href="#" class="btn" >Schedule Training</a>
	<a href="viewrequestedtraining.jsp" class="btn" >View Requested Training</a>
	<a href="adminviewnominations.jsp" class="btn">View Nominations</a>
	<!-- <a href="#" class="btn" >History</a> -->
    <a href="viewfeedback.jsp" class="btn" >View Feedback</a>
</div>  
</header>

<form onsubmit="return false">
<fieldset>
<legend>Add Training</legend>

<label>Training Id</label> 
<input type="text" id="trainingId" placeholder=" Enter TrainingId" required="required">

<label>Training Name</label> 
<input type="text" id="trainingName" placeholder="Enter Training Name" required="required">
				
<label>Domain</label> 
<select id="domain" required="required">
<option>C</option>
<option>C++</option>
<option>Java</option>
<option>Python</option>
<option>Web Techlology</option>
<option>X++</option>
<option>Full Stack Developer</option>
</select>
				
<label>StartDate</label> 
<input type="date" id="startDate" placeholder="Start Date" required="required">

<label>EndDate</label> 
<input type="date" id="endDate" placeholder="End Date" required="required">
					
<label>venue</label>
<select id="venue" >
<option>Upanishadh</option>
<option>Apoorthi</option>
<option>Navigator</option>
</select> 

<input type="submit" value="submit">
<input type="reset" value="reset">
</fieldset>
</form>
	
</body>
</html>