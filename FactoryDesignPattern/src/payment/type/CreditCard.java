package payment.type;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done through credit Card");
    }
}
