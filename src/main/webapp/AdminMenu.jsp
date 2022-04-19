<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page language="java"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
body {
	background-color: #008B8B;
	align-content: center;
	text-align: center;
}

#main {
	width: 100%;
	height: 300px;
	display: flex;
	flex-wrap: wrap;
	align-content: center;
	text-align: center;
	position: relative;
}

#main div {
	width: 100%;
	height: 40px;
	text-align: center;
}

input[type=text] {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	text-align: center;
}
input[type=password] {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	text-align: center;
}

input[type=button], input[type=submit], input[type=reset] {
	background-color: #C6CE00;
	border: none;
	color: white;
	width: 12%;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
	text-align: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 10%;
	background-color: #f1f1f1;
	position: fixed;
	height: 18%;
	overflow: auto;
	font-size: x-large;
}

li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color:olive;
	color: white;
}

li a:hover:not(.active) {
	background-color:olive;
	color: white;
}

select {
	height: 50%;
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	text-align: center;
}

option {
	display: block;
}
</style>
<script>
	function sh() {
		document.getElementById("tab").style.visibility = "visible";
	}
</script>
<body style="background-image: url('https://static.toiimg.com/photo/70739792.cms') ; background-attachment: fixed;
  background-size: cover;">
	
		<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">Admin Menu</h1>
		<ul>
			<li><a href="Home.jsp">Home</a></li>
		<li><a href="BookFlights.jsp">Insert Flight</a></li>
		<li><a href="Home.jsp">Logout</a></li>
		</ul>
		
	
</body>
</html>