package com.tnsif.Encapsulation;

public class Encapsulation {
	
	private int serialNum;//data variable
	private String name;
	private int age;
	//by using getter and setter
	
	void show() //
	{
		System.out.println("serial number"+serialNum+"\tName"+name +"age:"+ age);
		
	}

	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
