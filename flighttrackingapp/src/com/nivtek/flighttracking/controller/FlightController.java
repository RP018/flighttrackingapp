package com.nivtek.flighttracking.controller;

import com.flighttrackingapp.service.FlightService;
import com.nivtek.flighttracking.entity.FlightDetails;

public class FlightController {

	public FlightDetails getFlightDetails(String flightNo) {
		
		FlightService flightService = new FlightService();
		
		return flightService.getFlightDetails(flightNo);
	}
}
