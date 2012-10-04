package com.kd.job;

import java.io.*;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.validator.ValidatorForm;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class JobForm extends ValidatorForm
  
  {
	 private String key= null;
	    private String workexp= null;
	    private String jobpreference= null;
	    private String expsalary= null;
	    private String skillset= null;
	    private List results=null;


	    public void setKey(String key)
		{
			this.key=key;
		}

		public String getKey()
		{
			return key;
		}
		
	   public void setWorkExp(String workexp)
	    {
	    	this.workexp=workexp;
	    }
	    public String getWorkExp()
	    {
	    	return workexp;
	    }

	   public void setJobPreference(String jobpreference)
	    {
	    	this.jobpreference=jobpreference;
	    }
	    public String getJobPreference()
	    {
	    	return jobpreference;
	    }

	    public void setExpSalary(String expsalary)
	    {
	    	this.expsalary=expsalary;
	    }
	    public String getExpSalary()
	    {
	    	return expsalary;
	    }
	    public void setSkillSet(String skillset)
	    {
	    	this.skillset=skillset;
	    }
	    public String getSkillSet()
	    {
	    	return skillset;
	    }

	   public void setResults(List results)
			{
				this.results=results;
			}
	   public List getResults()
			{
				return results;
			}

	 public void reset(ActionMapping mapping,HttpServletRequest request)
	  {
	     
	    key= null;
	    workexp= null;
	    jobpreference= null;
	    expsalary= null;
	    skillset= null;
	    results=null;
	    
	   }
 
/*	 public ActionErrors validate(ActionMapping mapping,HttpServletRequest request)
  {
	ActionErrors errors=new ActionErrors();
	 boolean keyEntered =false;
	 boolean workexpEntered = false;
	 
		if(key !=null && key.length()>0 && key.length()<15)
		{
			keyEntered =true;
		}

		if(workexp !=null && workexp .length()>0)
		{
			workexpEntered = true;
			
		}
		if(!keyEntered || !workexpEntered)
		{
			errors.add(null,new ActionError("error.search.jobsearch.invalid"));
			//new ActionError("error.search.jobsearch.invalid")
		}

	    return errors;

  }*/

}

 
		

