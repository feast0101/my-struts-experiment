package com.travel.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class FlightSearchEngineImplementation extends
		AbstractSearchEngine {
	Flight fl=null;
	String Dep_loc;
	String Arr_loc;
	String Flight_Time;
	String user_pref;
	List flightDatafound = new ArrayList();
	
	public FlightSearchEngineImplementation(String depLoc, String arrLoc,
			String flightTime, String userPref) {
		super();
		Dep_loc = depLoc;
		Arr_loc = arrLoc;
		Flight_Time = flightTime;
		user_pref = userPref;

	}

	
	public List<Flight> SortResult(List<Flight> result) {
		
		if(!result.isEmpty())
		
		System.out.println("Flight result>>>>"+result);
		Collections.sort(result, new DurationComparator());
		return result;
	}

	
	public List<Flight> FlightSearch() {
		super.LoadFile(files);
		Iterator<Flight> it = super.consolidatedflightData.iterator();
		while (it.hasNext()) {
			fl= it.next();
					if(fl.getDEP_LOC().equalsIgnoreCase(Dep_loc) && fl.getARR_LOC().equalsIgnoreCase(Arr_loc) && fl.getFLIGHT_TIME().equalsIgnoreCase(Flight_Time)){
						flightDatafound.add(fl);
					}
						
		}
		return SortResult(flightDatafound);
	}



}
