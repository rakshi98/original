<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Post Training</title>
  <meta charset="utf-8">
  <script type="text/javascript" src="../scripts/empfeedback.js"></script>
  
  
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
</head>
<body>


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
        <li><a href="/Trainingmanagement/emphome.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/Trainingmanagement/empapplytraining.jsp">Apply</a></li>

            <li class="active"><a href="#">Post</a></li>
          </ul>
        </li>
        <li><a href="/Trainingmanagement/empnotification.jsp">Notification</a></li>
        <li><a href="/Trainingmanagement/emphistory.jsp">History</a></li>
		<li><a href="/Trainingmanagement/empgivefeedback.jsp">feedback</a></li>
      </ul>
    </div>
  </div>
</nav>


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