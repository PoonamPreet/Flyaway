<%@page import="java.awt.Taskbar.State"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page language="java"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
body {
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
	height: 36%;
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
	background-color: #125105;
	color: white;
}

li a:hover:not(.active) {
	background-color: #125105;
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
<body
	style="background-image: url('https://static.toiimg.com/photo/70739792.cms'); background-attachment: fixed; background-size: cover;">
	<form action="userLogin" method="post">
		<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">Home
		</h1>
		<br />
		</form>
		<form action="userLogin" method="post">
		 <input name="UserLogin" type="submit" value="User Login" /> <input
			name="AdminLogin" type="submit" value="Admin Login" /> <br />


	</form>


</body>
</html>