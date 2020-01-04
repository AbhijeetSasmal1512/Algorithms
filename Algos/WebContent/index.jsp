<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<title>Algoritms</title>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="resource/css/custom.css">
	
	<script>
		function signup() {
			$("main").load("resource/templates/signup.jsp");
			$("main").addClass('sign');
		}
		
		function signin() {
			$("main").load("resource/templates/signin.jsp");
			$("main").addClass('sign');
		}
	</script>
	
</head>
<body>
	<header>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="/Algos/index.jsp">Algorithms</a>
		    </div>
		    <ul class="nav navbar-nav navbar-right">
		      <li><a onclick="signup()"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		      <li><a onclick="signin()"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
		    </ul>
		  </div>
		</nav>
	</header>
	<main style="text-align:center;">
			<img alt="image" src="resource/image/image1.gif" width="400px" height="400px">
			<h3>Sequence of Steps that can be taken to solve a problem</h3>
	</main>
	<footer>
		<nav class="navbar navbar-inverse navbar-fixed-bottom ">
		  <div class="container-fluid">
		    <ul class="nav navbar-nav navbar-right">
		      <li><a href="#">Made By Abhijeet Sasmal</a></li>
		      <li><a href="#">Terms and Conditions</a></li>
		      <li><a href="#">Privacy Policy</a></li>
		    </ul>
		  </div>
		</nav>
	</footer>
</body>
</html>