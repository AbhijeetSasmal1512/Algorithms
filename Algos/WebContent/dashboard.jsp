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
	
</head>
<body >
	<header>
		<nav class="navbar navbar-inverse" style="margin:0px;">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="/Algos/index.jsp" >Algorithms</a>
		    </div>
		    
		    <div class="form-group nav navbar-nav navbar-right" style="margin:2px;">
				<button type="button" class="btn btn-default" onclick="start()">Go</button>
			</div>
			
		    <div class="form-group nav navbar-nav navbar-right">
			 	<div class="form-group" style="margin:10px;">
				  <select class="form-control" id="sel1" >
				    <option value="0">Insertion Sort</option>
				    <option value="1">Merge Sort</option>
				    <option value="2">Heap Sort</option>
				    <option value="3">Quick Sort</option>
				  </select>
				</div>
			</div>
			
		  </div>
		</nav>
	</header>
	<main>
		<script>
			$("main").append("<table id='scale' class='container'></table>");
			for (i = 0; i < 30; i++) {
				$("#scale").append("<tr id='"+i+"'></tr>");
				for (j =0; j < 100; j++) {
					$("#"+i).append("<td>&nbsp;1</td>");
				}
			}
			function clear() {
				for (i = 0; i < 30; i++) {
					for (j =0; j < 100; j++) {
						$("#"+i+" td:nth-child("+j+")").removeAttr('id');
					}
				}
			}
			function graph(arr) {
				clear();
				for (i = 0; i < 30; i++) {
					for (j =0; j < arr.length; j++) {
						if (i <= arr[j]) {
							$("#"+i+" td:nth-child("+j+")").attr('id', 'yes');
						}
					}
				}
			}
			function myLoop (i, obj) { 
				   setTimeout(function () {   
				      graph(obj[i]);
				      i++;
				      if (i < 99)
				    	  myLoop(i, obj);
				   }, 50);
			}
			
			function start() {
				var k = $("select").val();
				$.get("Events?algo="+k, function(data, status){
					var obj = JSON.parse(data);
					graph(obj[0]);
					myLoop(0, obj);
				});
			}
		</script>
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