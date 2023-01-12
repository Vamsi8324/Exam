package com.example4;

public class Main {

    public static void main(String[] args) {
        Candidate candidate1 = new Candidate();
        Candidate candidate2 = new Candidate();
        Candidate candidate3 = new Candidate();
        Candidate candidate4 = new Candidate();

        try {
            candidate1.validateCandidate("Rupesh",20,"btech");
            candidate2.validateCandidate("Rupesh1",32,"BE");
            candidate3.validateCandidate("Rahul",15,"BE");
            candidate4.validateCandidate("Rahul1",50,"btech");
        }
        catch(Exception e)
        {
            System.err.print(e.getMessage());
        }    
    }

 

}