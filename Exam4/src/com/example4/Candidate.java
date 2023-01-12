package com.example4;

public class Candidate {

    String name;
    int age;
    String education;

    public void validateCandidate(String name,int age, String education) throws AgeException,EduException
    {
        if(age<21)
        {
            throw new AgeException(
                    "Candidate is under age  " + name);
        }
        else if(age>60)
        {
            throw new AgeException(
                    "Candidate is above age  " + name);
        }

        if(!education.equals("btech"))
                {
            throw new EduException(
                    "Sorry invalid eductaion  " + name);            
                }            
    }
}
