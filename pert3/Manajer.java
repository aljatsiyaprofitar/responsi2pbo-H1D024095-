package pert3;
// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    private double tunjangan;
    
    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        double totalGaji = super.gajiPokok + this.tunjangan;

        System.out.println("Nama: " + super.nama + " | Gaji Pokok: Rp " + super.gajiPokok + " | Tunjangan: Rp " + this.tunjangan);
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}