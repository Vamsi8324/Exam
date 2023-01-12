package com.example9;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter movie id: ");		
		int id = Integer.parseInt(scanner.next());
		
		System.out.println("Enter no. of tickets: ");		
		int tickets = Integer.parseInt(scanner.next());
		
		scanner.close();
		if (id == 101 || id == 102 || id == 103) {
			BookMyMovie b1 = new BookMyMovie(id,tickets);
			b1.calculateTicketAmount();
		} else {
			System.out.println(id);
			System.out.println("1. Sorry! Invalid Movie ID!");
			System.out.println("2. Please check the Movie ID and enter once again. ");
		}
	}
}
