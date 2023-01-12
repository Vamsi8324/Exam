package com.example7;

public class Main {
    public static void main(String[] args) {
           User user1 = new User(1,"Rupesh","Rupesh@gmail.com",103);
           Wallet.processPaymentByUser(user1, 50);



           KYCUser user2 = new KYCUser(2,"Rahul","Rahil@gmail.com",1008,11);
           Wallet.processPaymentByUser(user2, 75);
       }
}