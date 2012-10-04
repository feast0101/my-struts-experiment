package com.travel.app;

import java.util.Comparator;

public class DurationComparator implements Comparator  {

	
	public int compare(Object o1, Object o2) {
		int flight1duration=((Flight)o1).getFLIGHT_DURN();
		int flight2duration=((Flight)o2).getFLIGHT_DURN();
		if(flight1duration>flight2duration)
			return 1;
		else if(flight1duration<flight2duration)
			return -1;
		else
		     return 0;
	}


}
