<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  

</head>
<body bgcolor="blue">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <!-- <a href="#" data-toggle="modal" class="profile-edit-btn">Virtusa</a> -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="adminhomepage.jsp">Home</a></li>
       
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="adminscheduletraining.jsp">Schedule Training</a></li>
             <li><a href="adminviewtrainings.jsp">ViewTrainings</a></li>
            <li><a href="viewrequested.jsp">View Requested Training</a></li>
          </ul>
        </li>
        <li><a href="adminviewfeedback.jsp">ViewFeedback</a></li>
		<li><a href="adminviewnominations.jsp">View Nomination</a></li>
		</ul>
  
    </div>
  </div>
</nav>
<h4>WELCOME TO ADMIN HOME PAGE!!</h4>
</body>
</html>