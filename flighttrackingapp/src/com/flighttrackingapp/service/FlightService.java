package com.flighttrackingapp.service;

import com.nivtek.flighttracking.entity.FlightDetails;
import com.nivtek.flighttrackingapp.dao.FlightDao;

public class FlightService {

	
	 public FlightDetails getFlightDetails(String flightNo) {
		 
		 FlightDao flightDao = new FlightDao();
		 
		 return flightDao.getFlightDetails(flightNo);
	 }
}
