package com.travel.app;

import java.util.Arrays;

public class TestSort {
	
public static void main(String args[]){
    //Employee array which will hold employees
    Flight flight[] = new Flight[4];
   
    //set different attributes of the individual employee.
    flight[0] = new Flight("BA235","DEL", "LON", "20thOct", "12AM", 22,  50000);
    flight[1] =  new Flight("BA985","MUM", "JFK", "24thOct", "2AM", 21,  65000);
    flight[2] =  new Flight("LF425","KOL", "LON", "10thOct", "12AM", 10, 19000);
    flight[3] =  new Flight("AF765","DEL", "LON", "20thOct", "10PM", 12,  25000);
    
    System.out.println("Order of flights before sorting is");
    //print array as is.
    for(int i=0; i < flight.length; i++){
        System.out.println( "Flight " + (i+1) + " arr_loc :: " + flight[i].getARR_LOC() + ", Flight_number :: " +flight[i].getFLIGHT_NUM());
}
    Arrays.sort(flight, new FareComparator());
    System.out.println("Order of flights after sorting is");
    //print array as is.
    for(int i=0; i < flight.length; i++){
        System.out.println( "Flight " + (i+1) + " arr_loc :: " + flight[i].getARR_LOC() + ", Flight_number :: " +flight[i].getFLIGHT_NUM());
}
}
}
