   <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>    
<html>
<head>
<title>View Training</title>
  <meta charset="utf-8">
  <link type="text/css" rel="stylesheet" href="../styles/empviewtraining.css">
  <script type="text/javascript" src="../scripts/empviewtraining.js"></script>
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
        <li><a href="../views/emphome.jsp">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Training<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li class="active"><a href="#">Apply</a></li>
            <li><a href="../views/empposttraining.jsp">Post</a></li>
          </ul>
        </li>
        <li><a href="../views/empnotification.jsp">Notification</a></li>
        <li><a href="../views/emphistory.jsp">History</a></li>
		<li><a href="../views/empgivefeedback.jsp">feedback</a></li>
      </ul>  
    </div>
  </div>
</nav>

<h3>Apply for Training</h3>
<table>

</table>
<a href="empapplytraining.jsp">APPLY</a>
</body>
</html>