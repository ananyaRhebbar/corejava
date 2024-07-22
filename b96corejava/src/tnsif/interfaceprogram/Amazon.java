//program to demonstrate interface
package tnsif.interfaceprogram;

public interface Amazon {
	int a=10;
	void welcome();   //abstract
	void thankyou();  //abstract
	
 default void  serviceCharge () {
	 int amt=100;
	 System.out.println("the service charge is"+amt);
	 
 }

 static void aboutUs() {
	 System.out.println("its a ecommerce web");
 }
}
