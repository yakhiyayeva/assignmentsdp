package strategy;

public class Main {
    public static void main(String[] args) {
        // Create a shopping cart with a total amount of $150
        ShoppingCart cart = new ShoppingCart(150.0);

        // Use Credit Card payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9101-1121", "John Doe", "123", "12/24");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout();

        // Use PayPal payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout();

        // Use Crypto payment
        PaymentStrategy cryptoPayment = new CryptoPayment("0xABC123DEF456", "Bitcoin");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout();
    }
}

