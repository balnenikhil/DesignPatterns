package payment.type;

public class PaymentFactory {

    public Payment getInstance(String paymentType){
        if(paymentType.equalsIgnoreCase("debit card"))
            return new DebitCard();

        if(paymentType.equalsIgnoreCase("credit card"))
            return new CreditCard();

        if(paymentType.equalsIgnoreCase("UPI"))
            return new UPI();
        return null;
    }
}
