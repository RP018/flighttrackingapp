package com.nivtek.flighttracking.entity;

/**
 * @author Bootcamp User 018
 *
 */
public class FlightDetails {

	private String flightNumber;
	private String departure;
	private String arrival;
	private String travelTime;
	private String totalDistance;
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the departure
	 */
	public String getDeparture() {
		return departure;
	}
	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	/**
	 * @return the arrival
	 */
	public String getArrival() {
		return arrival;
	}
	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	/**
	 * @return the travelTime
	 */
	public String getTravelTime() {
		return travelTime;
	}
	/**
	 * @param travelTime the travelTime to set
	 */
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	/**
	 * @return the totalDistance
	 */
	public String getTotalDistance() {
		return totalDistance;
	}
	/**
	 * @param totalDistance the totalDistance to set
	 */
	public void setTotalDistance(String totalDistance) {
		this.totalDistance = totalDistance;
	}
	
}
