package com.example1;


public class Main{

public static void main(String[] args) {

    int balance = 8000;
    int withdrawAmount = 2000;
    int depositAmount = 2000;


Account account= new Account();
    
    account.displayBalance(balance);

   
    balance= account.amountWithdrawing(balance, withdrawAmount);

   
    balance = account.amountDepositing(balance, depositAmount);



}
}