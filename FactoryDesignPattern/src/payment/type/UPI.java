package payment.type;

public class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done through UPI Id");
    }
}
