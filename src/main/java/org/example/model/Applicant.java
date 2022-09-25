package org.example.model;

import java.lang.String;

public class Applicant extends Person {
    private String isExperienced;
    private String isFemale;

    public Applicant(){

    }
    public Applicant(String isExperienced, String isFemale){
        this.isExperienced = isExperienced;
        this.isFemale = isFemale;
    }

    public String getIsExperienced() {
        return isExperienced;
    }

    public String getIsFemale() {
        return isFemale;
    }

    public void setIsExperienced(String isExperienced) {
        this.isExperienced = isExperienced;
    }

    public void setFemale(String female) {
        isFemale = female;
    }

}
