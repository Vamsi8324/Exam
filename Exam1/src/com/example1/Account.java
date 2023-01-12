package com.example1;


public class Account {

    private int accnum;
    private String name;
        public static int amountDepositing(int balance,
                                        int depositAmount)
        {
            System.out.println("Deposit Operation:");
            System.out.println("Amount to deposit : "
                            + depositAmount);
            balance = balance + depositAmount;
            System.out.println(
                "Your Money has been successfully deposited");
            displayBalance(balance);
            return balance;
        }

 

    
    public static int amountWithdrawing(int balance,
                                        int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                        + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(
                "Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    public static void displayBalance(int balance)
    {
        System.out.println("Account Balance : " + balance);
        System.out.println();
    }

 

    

 

   
 

}