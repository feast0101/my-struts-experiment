package com.kd.hibernate;

 public class Job_Details {

 private int id;
 private String key;
 private String workexp;
 private String expsalary;
 private String skillset;
 private String jobpreference;

    public String getExpsalary() {
        return expsalary;
    }

    public void setExpsalary(String expsalary) {
        this.expsalary = expsalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobpreference() {
        return jobpreference;
    }

    public void setJobpreference(String jobpreference) {
        this.jobpreference = jobpreference;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp;
    }

} 