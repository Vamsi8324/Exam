package com.exam3;

public class Main {
	public static void main(String args[]) {
		 System.out.println("Bird instance:");
	Bird b = new Bird();
	b.eat();
    b.sleep();
    b.fly();
    System.out.println("WildAnimal instance:");
    WildAnimal w=new WildAnimal();
    
    w.eat();
    w.sleep();
    w.kill();
    System.out.println("Animal instance:");
  Animal a =new Bird();
  a.eat();
  a.sleep();
}
}