package pert7;

public class EWalletPayment implements PaymentMethod {

    private String providerName;
    private double paymentAmount;
    private double balance;

    public EWalletPayment(String providerName, double paymentAmount, double balance) {
        this.providerName = providerName;
        this.paymentAmount = paymentAmount;
        this.balance = balance;
    }

    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    @Override
    public void processPayment() {
        double totalCost = paymentAmount + getTransactionFee();

        if (balance >= totalCost) {
            balance -= totalCost;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + providerName;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
