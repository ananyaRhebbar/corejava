package tnsif.abstractprograms;

public class Hithesha extends TaxPayer {

	public Hithesha(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}
}
