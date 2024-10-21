package strategy;

public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;
    private String cryptoCurrency;

    public CryptoPayment(String walletAddress, String cryptoCurrency) {
        this.walletAddress = walletAddress;
        this.cryptoCurrency = cryptoCurrency;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount + " in " + cryptoCurrency);
        // Additional logic for processing cryptocurrency payment
    }
}

