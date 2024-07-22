package com.tns.threads;

public class SecondWay implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SecondWay t= new SecondWay();  //new state
         Thread th=new Thread(t);
         th.start(); //runnable 
         th.start();
         th.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("creation of thread by extending thread class");
	}

}
