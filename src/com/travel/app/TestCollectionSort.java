package com.travel.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestCollectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flight fl=null;
		ArrayList al=new ArrayList();
		
		al.add(new Flight("BA235","DEL", "LON", "20thOct", "12AM", 22,  50000));
		al.add(new Flight("BA985","MUM", "JFK", "24thOct", "2AM", 21,  65000));
		al.add(new Flight("LF425","KOL", "LON", "10thOct", "12AM", 10, 19000));
		al.add(new Flight("AF765","DEL", "LON", "20thOct", "12AM", 12,  25000));
		
		 System.out.println("Order of flights before sorting is");
		    //print collection as it is.
		 
		 Iterator<Flight> it=al.iterator();
		 while(it.hasNext()){
			  fl = it.next();
			 System.out.println("Flight no.: " + (fl.getFLIGHT_NUM()) + " arr_loc :: " + fl.getARR_LOC() + ", Fare :: " +fl.getFARE());
		 }
		 Collections.sort(al, new FareComparator());
		 System.out.println("Order of flights after sorting is");
		 Iterator<Flight> it2=al.iterator();
		 while(it2.hasNext()){
			  fl = it2.next();
			 System.out.println("Flight no.: " + (fl.getFLIGHT_NUM()) + " arr_loc :: " + fl.getARR_LOC() + ", Fare :: " +fl.getFARE());
		 }

	}

}
