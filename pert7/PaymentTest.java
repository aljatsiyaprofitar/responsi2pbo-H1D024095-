package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        EWalletPayment eWallet = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        System.out.println("Saldo awal: " + (int)eWallet.getBalance());
        System.out.println("Memproses pembayaran sebesar 50000...");

        eWallet.processPayment();

        System.out.println("Sisa saldo: " + (int)eWallet.getBalance());
        System.out.println(eWallet.getPaymentDetails());
    }
}
