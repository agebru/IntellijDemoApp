package com.app.demoapp;

import javax.annotation.PostConstruct;

public class Doctor {
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;


    public void assist(){
        System.out.println("Doctor is Assisting...");
    }
    @PostConstruct
    public void postConstructDoctor(){
        System.out.println("Post Construction of Doctor");
    }

    @Override
    public String toString() {
        return "qualification=" + qualification ;
    }
}
