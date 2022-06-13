package BL;

public class PaymentFactory {

	PaymentHandler PH;
	static PaymentFactory PF;
	
	private PaymentFactory(String paymentMethod) {
		
		if(paymentMethod.equals("Cash")) {
			
			PH = new PayByCash();
			
		}
		else if(paymentMethod.equals("Card")) {
			
			PH = new PayByCardAdapter();
			
		}
		else if(paymentMethod.equals("EasyPaisa")) {
			
			PH = new PayByEasypaisaAdapter();
			
		}
		
		
	}
	
	public static PaymentFactory getInstance(String paymentMethod) {
		
		try {
			
			if(PF == null) {
				
				PF = new PaymentFactory(paymentMethod);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return PF;
		
	}
}
