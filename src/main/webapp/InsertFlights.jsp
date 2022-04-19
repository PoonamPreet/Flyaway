<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/momentjs/2.14.1/moment.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<style>
.container {
	margin-top: 40px;
	align-content: center;
	text-align: center;
}

.btn-primary {
	width: 20%;
	align-content: center;
	text-align: center;
}

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

div {
	width: 35%;
	padding: 12px 20px;
	margin: 1% 33%;
	box-sizing: border-box;
	text-align: center;
}

span {
	width: 100%;
	margin: 2px 35%;
	text-align: center;
	box-sizing: border-box;
}
</style>

<script>
	$(function() {

		$('#datetimepicker1').datetimepicker();
		$('#datetimepicker2').datetimepicker();

	});
</script>

<body
	style="background-image: url('https://static.toiimg.com/photo/70739792.cms'); background-attachment: fixed; background-size: cover;">
	<form action="insertFlight" method="post">
		<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">Insert
			Flights</h1>
		<input name="flight_name" type="text" placeholder="Enter Flight Name" />
		<br /> <input name="flight_number" type="text"
			placeholder="Enter Flight Number" /> <br /> <input name="Departure"
			type="text" placeholder="Departure" /> <br /> <input name="Arrival"
			type="text" placeholder="Arrival" /> <br />
		<div class='input-group date' id='datetimepicker1'>
			<input type='text' class="form-control" id='datetimepicker1'
				name="Arrival_time" placeholder="Arrival_time" /> <span
				class="input-group-addon"> <span
				class="glyphicon glyphicon-calendar"></span>
			</span>
		</div>
		<div class='input-group date' id='datetimepicker2'>
			<input type='text' class="form-control" id='datetimepicker2'
				name="Departure_time" placeholder="Departure_Time" /> <span
				class="input-group-addon"> <span
				class="glyphicon glyphicon-calendar"></span>
			</span>
		</div>




		<br /> <br /> <input type="submit" name="Submit" id="submit" /> <br />
	</form>
</body>
</html>