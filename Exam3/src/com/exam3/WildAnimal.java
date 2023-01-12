package com.exam3;

public class WildAnimal extends Animal {

	
	    @Override
	    public void eat() {
	        super.eat();
	        System.out.println("overide eat");
	    }

	    @Override
	    public void sleep() {
	        super.sleep();
	        System.out.println("override sleep");
	    }

	    public void kill()
	    {
	        System.out.println(" kill method");

	    }
	}

