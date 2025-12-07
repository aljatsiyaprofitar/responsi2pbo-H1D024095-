package pert8;

public interface KaryawanKontrak {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================

    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================

    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}