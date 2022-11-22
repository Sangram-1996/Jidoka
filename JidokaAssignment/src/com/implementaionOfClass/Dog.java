package com.implementaionOfClass;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}
	
	
	public static void main(String[] args) {
		Animal animal= new Dog();
		
		animal.eat();
	}
	
	
	
	
	//Here Animal interface is implemented by Dog class. This way we can implement class in java. 

}
