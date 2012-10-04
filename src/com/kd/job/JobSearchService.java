package com.kd.job;

import java.util.ArrayList;

 public class JobSearchService
 {
  private static BASE[] jobs =
  {
		new BASE("Software Programmer","2","1000000","Oracle,JAVA","Full Time"),
		new BASE("Software Architect","8","1500000","VB,JAVA","Full Time"),
		new BASE("Designer","3","1200000","Swing,VB","Part Time"),
		new BASE("Sales Manager","4","125000","PR,Good Comm","Full Time"),
		new BASE("Product Manager","7","115000","SAP","Full Time"),
		new BASE("CEO","10","500000","Oracle,JAVA,SAP,MIS","Full Time")
	  }; 
	  public ArrayList searchByKeyword(String key)
	      {
		  ArrayList resultList=new ArrayList();
		  
		  for(int i=0;i<jobs.length;i++)
		    {
			  if(jobs[i].getKey().toUpperCase().indexOf(key.toUpperCase())!=-1)
			  {
				  resultList.add(jobs[i]);
			  }
		    }
		  return resultList;
	  }
	}