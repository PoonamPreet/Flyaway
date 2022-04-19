package com.hibernate.bean;

public class InsertFlights {
private int flight_id;
private String flight_name;
private String flight_number;
private String Departure;
private String Arrival;
private String Departure_time;
private String Arrival_time;
public int getFlight_id() {
	return flight_id;
}
public void setFlight_id(int flight_id) {
	this.flight_id = flight_id;
}
public String getFlight_name() {
	return flight_name;
}
public void setFlight_name(String flight_name) {
	this.flight_name = flight_name;
}
public String getFlight_number() {
	return flight_number;
}
public void setFlight_number(String flight_number) {
	this.flight_number = flight_number;
}
public String getDeparture() {
	return Departure;
}
public void setDeparture(String departure) {
	Departure = departure;
}
public String getArrival() {
	return Arrival;
}
public void setArrival(String arrival) {
	Arrival = arrival;
}
public String getDeparture_time() {
	return Departure_time;
}
public void setDeparture_time(String departure_time) {
	Departure_time = departure_time;
}
public String getArrival_time() {
	return Arrival_time;
}
public void setArrival_time(String arrival_time) {
	Arrival_time = arrival_time;
}
@Override
public String toString() {
	return "InsertFlights [flight_id=" + flight_id + ", flight_name=" + flight_name + ", flight_number=" + flight_number
			+ ", Departure=" + Departure + ", Arrival=" + Arrival + ", Departure_time=" + Departure_time
			+ ", Arrival_time=" + Arrival_time + "]";
}

}
