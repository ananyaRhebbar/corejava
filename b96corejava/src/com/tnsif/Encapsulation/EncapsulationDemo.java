package com.tnsif.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encapsulation ob= new Encapsulation();//creating an object
		//ob.name="abc"; //calling the variables
		//ob.age=33;
		//ob.serialNum=22;
		ob.setSerialNum(22);
		ob.setAge(20);
		ob.setName("abc");
		//ob.show();
		
		System.out.println(ob);//without testing method it will give the location of the object

	}

}
