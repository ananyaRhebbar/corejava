package com.tnsif.staticprograms;

public class MyClass {
	private int section;// instance variable
	static int srNO;//static variable
	
	static {
         System.out.println("---static block---");
         srNO=1000;
             //section++;
         
	}

	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("---Deafult constructor---");
	}
	static void display() {
		System.out.println("---static method---");
		System.out.println("the serial no is "+srNO++);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
}
