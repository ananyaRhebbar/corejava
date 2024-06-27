package assignment2;

import  java.util.Scanner;

public class Commission {
	
	private String Name;
	private String Adress;
	private String Phone;
	private float sales_amount;
	private double Commission;

	
   public void emp_Details() {
	   //taking input using scanner
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the  Name:");
	   Name = sc.nextLine();
	   System.out.println("Enter the Adress:");
		Adress = sc.nextLine();
		System.out.println("Enter the phone Number:");
		Phone = sc.next();
		System.out.println("Enter the sales Amount:");
		sales_amount = sc.nextInt();
		sc.close();
   }
		
   public double calc_commission() {
		// calculating commission
		if (sales_amount >= 100000) {
			Commission = sales_amount + (sales_amount * 0.1);
		}
		else if (50000 <= sales_amount && sales_amount < 100000) {
			Commission = sales_amount + (sales_amount * 0.05);
		}
		else if (30000 <= sales_amount && sales_amount < 50000) {
			Commission = sales_amount + (sales_amount * 0.03);
		}
		else {
			Commission = 0;
		}
		return Commission; // return commission
		
		}
	
			}
			
   
	   
   
