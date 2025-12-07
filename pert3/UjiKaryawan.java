package pert3;

class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
        Karyawan karyawan1 = new Karyawan("Budi Santoso", 4000000);
        
        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        karyawan1.tampilInfo();
        
        System.out.println(); // Baris baru/jarak

        // Buat objek Manajer (Siti)
        Manajer manajer1 = new Manajer("Siti Aminah", 6000000, 2500000);
        
        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        manajer1.tampilInfo();
    }
}