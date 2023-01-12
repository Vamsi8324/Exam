package com.exam3;

class Bird extends Animal{
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

    public void fly()
    {
        System.out.println(" fly method");

    }
}