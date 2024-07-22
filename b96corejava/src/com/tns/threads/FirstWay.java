package com.tns.threads;

public class FirstWay extends Thread{
	public void run() { //running state
	System.out.println("creation of thread by extending thread class");
}
  public static void main(String[] args) {
	  
	  FirstWay ob=new FirstWay();   //thread is born new state
	  //ob.stop();//
	  ob.start(); //runnable
	 // ob.stop();
  }
}
