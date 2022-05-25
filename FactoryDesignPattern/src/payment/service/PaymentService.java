package payment.service;

import payment.type.CreditCard;
import payment.type.Payment;
import payment.type.PaymentFactory;

import java.util.Scanner;

public class PaymentService {
    public static void main(String[] args) {

        /* Payment payment = new CreditCard();
        payment.pay();  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Payment Type you want to choose for payment (only credit, debit and UPI available) : " );
        String paymentType = scan.nextLine();
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.getInstance(paymentType);
        payment.pay();
    }
}
/* Advantages: Factory Method Pattern allows the sub-classes to choose the type of objects to create.
It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
useful in When a class doesn't know what sub-classes will be required to create*/

