package com.inheritance;

public class Dog extends Animal {
	
	
	
	public Dog(String name) {
		super(name);
	}
	
	
	public static void main(String[] args) {
		
		
		
		Dog d= new Dog("Tommy");
		
		System.out.println(d.name);
		
		
	}

	/*
	
	Here animal class is the parent class and dog is the child class. Here dog class inherit the animal class.
	Here is the example of inheritance. From dog class we can get the name of animal class. 
	In inheritance the child class can access the variable and method of the parent class.

	*/

}
