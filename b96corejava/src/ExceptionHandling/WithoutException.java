package ExceptionHandling;

public class WithoutException {
	public static void main (String args[]) {
		int d=0;
		try {
		int a=42/d;  //exception is raised
		System.out.println("ananya");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception handel sucessfully"+e.getMessage());
		}
		System.out.println("will not be printed");
	}

}
