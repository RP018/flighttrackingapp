package com.nivtek.flighttrackingapp.dao;

import com.nivtek.flighttracking.entity.FlightDetails;

public class FlightDao {

	public FlightDetails getFlightDetails(String flightNo) {
		FlightDetails flightDetails = new FlightDetails();
		if ( flightNo.equalsIgnoreCase("QR759")) {		
			flightDetails.setDeparture("DFW");
			flightDetails.setArrival("LAX");
			flightDetails.setTravelTime("3 hours");
			flightDetails.setTotalDistance("2500 Miles");
		}
		
		else if(flightNo.equalsIgnoreCase("QR769")){
			flightDetails.setDeparture("DFW");
			flightDetails.setArrival("EWR");
			flightDetails.setTravelTime("4 hours");
			flightDetails.setTotalDistance("4500 Miles");						
		}
		
		else if(flightNo.equalsIgnoreCase("QR779")) {
			flightDetails.setDeparture("LAS");
			flightDetails.setArrival("DAL");
			flightDetails.setTravelTime("5 hours");
			flightDetails.setTotalDistance("3500 Miles");
		}
		flightDetails.setFlightNumber(flightNo);
		
		return flightDetails;
	
	}
	
}
