package assignment2;

public class commissionMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission ob = new Commission();
		ob.emp_Details();
		double commission = ob.calc_commission();
		//print out the commission
		System.out.println("The commission for the Sales amount is: "+commission);
		
	}

}


