package tnsif.abstractprograms;
//non concrete class
public abstract class TaxPayer {
	protected double salary;
	public TaxPayer(double salary) {
		super();
		this.salary = salary; 
		}
   public abstract double calTax();//abstract method
   public void display() {// non abstract method
	   System.out.println("the tax payed");
	   
	   }
   }

