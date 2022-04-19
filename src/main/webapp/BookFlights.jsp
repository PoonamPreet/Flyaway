<%@page import="java.awt.Taskbar.State"%>
	<%@ page import = " java.util.* " %>
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
	background-color: olive;
	color: white;
}

li a:hover:not(.active) {
	background-color: olive;
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
	<!-- <form action="bookFlight" method="post"> -->
	<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">
		Book Flights</h1>
	<ul>
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="BookFlights.jsp">Book Flight</a></li>
		<li><a href="Home.jsp">Logout</a></li>
	</ul>
	<br />
	<select name="from">
		<option value="from" name="from">From</option>

		<%
				try
				{
					String Query="select Departure from InsertFlights";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flyaway?useSSL=false","root","Poonam@8989");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(Query);
					while(rs.next())
					{
						%>
		<option name="from" value="<%=rs.getString("Departure")%>"><%=rs.getString("Departure")%></option>
		<%
						System.out.println(rs.getString("Departure"));
					}
					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
				%>

	</select>
	<select name="to">
		<option value="to" name="to">To</option>

		<%
				try
				{
					String Query="select Arrival from InsertFlights";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flyaway?useSSL=false","root","Poonam@8989");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(Query);
					while(rs.next())
					{
						%>
		<option name="to" value="<%=rs.getString("Arrival")%>"><%=rs.getString("Arrival")%></option>
		<%
						System.out.println(rs.getString("Arrival"));
					}
					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					System.out.println(ex.getMessage());
				}
				%>

	</select>
	<br />
	<br />
	<input type="submit" name="Submit" onclick="sh()" />
	<br />
	<table border="1" id="tab"
		style="visibility: hidden; color: #F0FFF0; background-color: #C6CE00; width: 80%; margin-left: 15%;">
		<tr>

			<th>Flight Number</th>
			<th>Flight Name</th>
			<th>From</th>
			<th>To</th>
			<th>Time</th>
			<th>Delete</th>
		</tr>
		<%
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flyaway?useSSL=false", "root",
			"Poonam@8989");
			String from=request.getParameter("from"); 
			String to=request.getParameter("to"); 
			String query = "select * from InsertFlights where departure="+from+" and arrival="+to;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
		%>

		<tr>
			<td><input type="text" name="flight_id"
				value="<%=rs.getString("flight_id")%>"></td>
			<td><input type="text" name="flight_name"
				value="<%=rs.getString("flight_name")%>"></td>
			<td><input type="text" name="flight_number"
				value="<%=rs.getString("flight_number")%>"></td>
			<td><input type="text" name="Departure"
				value="<%=rs.getString("Departure")%>"></td>
			<td><input type="text" name="Arrival"
				value="<%=rs.getString("Arrival")%>"></td>
			<td><input type="text" name="Departure_Time"
				value="<%=rs.getString("Departure_Time")%>"></td>
			<td><input type="text" name="Arrival_time"
				value="<%=rs.getString("Arrival_time")%>"></td>
			<td><input type="button" name="book" value="Book"
				style="width: 60; font-family: sans-serif; font-size: medium; text-align: left; color: #FF0000"></td>

		</tr>
		<%
		}
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		%>
	</table>
	<!-- </form> -->
</body>
</html>