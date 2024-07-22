//prgm to demonstrate try multiple catch block
package ExceptionHandling;

public class TryCatch {
     public static void divide () {
    		int a=6, b=0,c; 
    		try {
    		 c=a/b;// exception is raised
    		}
    		
    		 catch(ArithmeticException e) {
    			 
    			 System.out.println("exception is caught"+e.getMessage());
    			 }
    		
    			 catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println("exception is caught"+e.getMessage());
    				
    			}
    		catch(Exception e){
    			System.out.println("exception is caught"+e.getMessage());
    		   System.exit(0);
    		 }
    		finally {
    			System.out.println("executed weather exception occurs or not ");
    		} 
    		  } 
     }
     


