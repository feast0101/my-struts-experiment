/**
 * 
 */
package com.travel.app;

import java.util.Iterator;
import java.util.List;

/**
 * @author Kallol
 * 
 */
public class SearchClient {
	
	
	static void FlightSearchDisplayConsole(){
		FlightSearchEngineImplementation search = null;
		Flight fl=null;
		System.out.println("Please Enter Departure Location:");
		System.out.println("Please Enter Arrival Location:");
		System.out.println("Please Enter Flight Date:");
		System.out.println("Please Enter Output Preference:");
		System.out.println("Searching.....");
		List<Flight> flightlist = null;
/*
		for (String io : args)
			search = new FlightSearchEngineImplementation(args[0], args[1],
					args[2], args[3]);*/
		search= new FlightSearchEngineImplementation("DEL","LON", "12AM", "FARE");
		flightlist = search.FlightSearch();
		if (flightlist.isEmpty())
			System.out.println("Sorry, No flights available.....try some other date");
		else {
			System.out.println("Search Result as follows:");
			Iterator<Flight> it = flightlist.iterator();

			while (it.hasNext()){
				fl=it.next();
				System.out.println("Flight no.: " + (fl.getFLIGHT_NUM()) + " arr_loc :: " + fl.getARR_LOC() + ", Fare :: " +fl.getFARE());
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlightSearchDisplayConsole();

	}
}
