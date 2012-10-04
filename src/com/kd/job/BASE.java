package com.kd.job;

 public class BASE
 {
	 private String key;
	    private String workexp;
	    private String expsalary;
	    private String skillset;
	    private String jobpreference;
	    
	    public BASE(String key,String workexp,String expsalary,String skillset,String jobpreference )
	    {
	    	this.key=key;
	    	this.workexp=workexp;
	    	this.expsalary=expsalary;
	    	this.skillset=skillset;
	    	this.jobpreference=jobpreference;
		}   	 	  	  	 

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
	    public void setJobPreference(String jobpreference)
	    {
	    	this.jobpreference=jobpreference;
	    }
	    public String getJobPreference()
	    {
	    	return jobpreference;
	    }
	}