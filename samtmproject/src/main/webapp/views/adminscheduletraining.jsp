<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet"
	href="../styles/adminscheduletraining.css">
<script type="text/javascript"
	src="../scripts/adminscheduletraining.js"></script>
	
	

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- <a href="#" data-toggle="modal" class="profile-edit-btn">Virtusa</a> -->
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="adminhomepage.jsp">Home</a></li>
					<li><a href="adminprofile.jsp">Profile</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="adminscheduletraining.jsp">Schedule
									Training</a></li>
							<li><a href="viewrequested.jsp">View Requested Training</a></li>

							<li><a href="adminviewhistory.jsp">History</a></li>
						</ul></li>
					<li><a href="adminfeedback.jsp">Feedback</a></li>
					<li><a href="adminviewfeedback.jsp">ViewFeedback</a></li>
					<li><a href="adminviewnominations.jsp">View Nomination</a></li>
				</ul>

			</div>
		</div>
	</nav>


	<div class="div1">


		<form onsubmit="return false">
			<fieldset class="shcheduletraining">

				<legend> scheduletraining</legend>
				<p>
					<label for="trainingId">Trining Id</label> <input type="text"
						id="trainingId" placeholder=" Enter TrainingId">
				</p>
				<p>
					<label for="trainingName">Training Nmae</label> <input type="text"
						id="trainingName" placeholder="Training Name">
				</p>
				<p>
					<label for="domain">Domain</label> <select class="text" id="domain">
						<option>C</option>
						<option>C++</option>
						<option>Java</option>
						<option>Python</option>
						<option>Web Techlology</option>
						<option>X++</option>
						<option>Full Stack Developer</option>
					</select>
				</p>
				<p>

					<label for="startDate">StartDate
					</label> <input type="date"
						id="startDate" placeholder="Start Date">
				</p>
				<p>
					<label for="endDate">EndDate</label> 
					<input type="date" id="endDate" placeholder="End Date ">
					
				<p>
					<label for="venue">venue</label> <select class="text" id="venue">
						<option>Upanishadh</option>
						<option>Apoorthi</option>
						<option>Navigator</option>
					</select> <input type="submit" value="submit">
				</p>
			</fieldset>
		</form>
	</div>

</body>
</html>