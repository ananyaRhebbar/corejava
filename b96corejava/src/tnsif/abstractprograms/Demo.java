package tnsif.abstractprograms;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc=new Scanner(System.in); 
    System.out.println("enter the salary of akash");
    double akashsalary=sc. nextDouble();
	TaxPayer ob=new Akash(akashsalary);
	
	 System.out.println("tax akash");
	 ob.display();
	 
	 System.out.println("tax hithesha");
	 ob.display();
	 sc.close();
         
         
	}

}
