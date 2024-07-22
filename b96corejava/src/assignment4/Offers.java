package assignment4;

public class Offers implements Amazon , Flipkart{
	@Override
	public void welcome() {
		System.out.println("welcome to the great deals");
		// TODO Auto-generated method stub
	
	}

	@Override
	public void ThankYou() {
		System.out.println("hope you had great shopping! ThankYou");
		} 
		
		// TODO Auto-generated method stub
		
		public void OffersProvided() {
			//static method from amazon
			Amazon.aboutus(); 
			int amazon=Amazon.ProductPrice();  
			//static method form Flipkart
			Flipkart.aboutus(); 
			int flipkart = Flipkart.ProductPrice();
					
	
			if ( amazon < flipkart) {
				System.out.println("the best offers is from amazon: "+amazon);
			}
			else {
				System.out.println("the best offers is from flipkart: "+flipkart);
			}
		}
			
		  }
		
