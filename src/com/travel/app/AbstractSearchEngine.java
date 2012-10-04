package com.travel.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;

public abstract class AbstractSearchEngine implements SearchEngine {
	List<String> files = new ArrayList();
	String Arr_loc = null;
	String Flight_Time = null;
	String user_pref = null;
	String Dep_loc = null;
	List consolidatedflightData = new ArrayList();
	int flie_number;
	String filename;


	public boolean CheckLogin() {
		// TODO need to check authentication
		return true;
	}
	public void LoadFile(List<String> files) {

				// TODO Load File implementation

		consolidatedflightData.add(new Flight("BA235","DEL", "LON", "20thOct", "12AM", 10,  50000));
		consolidatedflightData.add(new Flight("BA985","MUM", "JFK", "24thOct", "2AM", 21,  65000));
		consolidatedflightData.add(new Flight("LF425","KOL", "LON", "10thOct", "12AM", 10, 19000));
		consolidatedflightData.add(new Flight("AF765","DEL", "LON", "20thOct", "12AM", 12,  25000));
		
	}

	public abstract List<Flight> FlightSearch();

}
