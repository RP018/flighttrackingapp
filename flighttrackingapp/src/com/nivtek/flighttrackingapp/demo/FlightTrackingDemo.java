package com.nivtek.flighttrackingapp.demo;

import java.util.Scanner;

import com.nivtek.flighttracking.controller.FlightController;
import com.nivtek.flighttracking.entity.FlightDetails;

public class FlightTrackingDemo {



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Flight Number");
		Scanner scanner=new Scanner(System.in);
		
		String flightNumber=scanner.nextLine();
		scanner.close();
		
		FlightController flightcontroller=new FlightController();
		FlightDetails flightDetails = new FlightDetails(); 
		flightDetails = flightcontroller.getFlightDetails(flightNumber);
		
		System.out.println("Your Flight Details are:");
		System.out.println("Departure Airport is:"+flightDetails.getDeparture());
		System.out.println("Arrival Airport is :"+flightDetails.getArrival());
		System.out.println("Flight Travel time is:"+flightDetails.getTravelTime());
		System.out.println("Flight total Distance is"+flightDetails.getTotalDistance());
		
		
	}

}
