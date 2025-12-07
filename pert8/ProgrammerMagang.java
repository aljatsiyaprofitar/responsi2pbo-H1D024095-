package pert8;

class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================

    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * this.gajiPerJam;
        System.out.println("Gaji " + this.nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    // Override Default Method dari KaryawanKontrak
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================

    @Override
    public void login(String pin) {
        if (pin.equals(this.pinRahasia)) {
            this.sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + this.nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        this.sedangLogin = false;
        System.out.println(this.nama + " berhasil logout.");
    }

    // Override Default Method dari AksesSistem
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}