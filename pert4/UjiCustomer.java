package pert4;

public class UjiCustomer {
    public static void main(String[] args) {

        // TODO: Buat object Customer
        Customer cust1 = new Customer("Budi Santoso", "CST-001", 500000);

        // TODO: Buat object Member
        Member memb1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // TODO: Tampilkan info untuk Customer biasa
        System.out.println("\nStatus: Customer Biasa");
        cust1.tampilkanInfo();

        // TODO: Tampilkan info untuk pelanggan Member
        System.out.println("\nStatus: Member");
        memb1.tampilkanInfo();
    }
}
