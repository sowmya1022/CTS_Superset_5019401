


// StrategyPatternTest.java
public class StrategyPattern {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        // Create payment context
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);

        // Execute payment using Credit Card
        System.out.println("Testing Credit Card Payment:");
        paymentContext.executePayment(150.75);

        // Change payment strategy to PayPal
        paymentContext.setPaymentStrategy(payPalPayment);

        // Execute payment using PayPal
        System.out.println("\nTesting PayPal Payment:");
        paymentContext.executePayment(200.50);
    }
}