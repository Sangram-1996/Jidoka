package com.exceptionHandling;

public class A {
	
	
	public void calculation(int num)throws CalculationException {
		if(num%2==0) {
			throw new CalculationException("Given number is a even number.");
		}
		else {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		
		A a= new A();
		
		try {
			a.calculation(10);
		} catch (CalculationException ce) {
			System.out.println(ce.getMessage());
		}
		
		
	}
	
	/*
	Here i have create a method in class a which calculate the provide number whether that is 
	a odd number or even number. If that is a even number then the method will throws a exception to the caller.
	 In caller side i have handling it with try catch block. If exception occurs then it will print the
	 appropriate message.
	*/
	

}
