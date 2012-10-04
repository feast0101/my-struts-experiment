package com.travel.app;

import java.util.Comparator;
import java.util.Map;

public class FareComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		 //parameter are of type Object, so we have to downcast it to Employee objects
       /* int flightfare01 = (int) ((Map)o1).get("khghkg");
        int flightfare02 = (int) ((Map)o1).get("khghkg");*/
        int flight1fare = ((Flight)o1).getFARE();        
        int flight2fare = ((Flight)o2).getFARE();
        if(flight1fare > flight2fare)
            return 1;
        else if(flight1fare < flight2fare)
            return -1;
        else
            return 0; 
	}
	

}
