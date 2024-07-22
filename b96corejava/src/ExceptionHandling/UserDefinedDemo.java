package ExceptionHandling;

public class UserDefinedDemo {
  public static void main(String[] arg) {
	  try {
		  UserDefined.validate(int);
	  } catch (Age e) {
		  System.out.println("Age exception caught"+e.getMessage());
	  }
  }
}
