package interface4;

public class PaymentProcess {
     public static void main(String[] args) {
		Payment C = new Creditcardpayment();
		Payment P = new PaypalPayment();
		
		C.pay();
		P.pay();
	}
}
