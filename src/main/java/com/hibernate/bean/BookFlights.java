package com.hibernate.bean;

public class BookFlights {
private int flight_id;
private String flight_name;
private String flight_number;
private String Departure;
private String Arrival;
private String Departure_Time;
private String Arrival_Time;
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
public String getDeparture_Time() {
	return Departure_Time;
}
public void setDeparture_Time(String departure_Time) {
	Departure_Time = departure_Time;
}
public String getArrival_Time() {
	return Arrival_Time;
}
public void setArrival_Time(String arrival_Time) {
	Arrival_Time = arrival_Time;
}
@Override
public String toString() {
	return "BookFlights [flight_id=" + flight_id + ", flight_name=" + flight_name + ", flight_number=" + flight_number
			+ ", Departure=" + Departure + ", Arrival=" + Arrival + ", Departure_Time=" + Departure_Time
			+ ", Arrival_Time=" + Arrival_Time + "]";
}


}
