package ExceptionHandling;

import java.util.Scanner;

public class UserDefined {
	private static int Age;
	static void validate () throws Age{ 
  Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		Age=sc.nextInt();
		if(Age<18)  {
			throw new Age("invalid age");
		}
		else {
			System.out.println("valid age");
		}
		}
		}
