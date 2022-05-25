package payment.type;

public class DebitCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done through Debit Card");
    }
}
