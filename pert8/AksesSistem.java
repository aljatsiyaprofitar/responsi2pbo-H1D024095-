package pert8;

public interface AksesSistem {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    
    void login(String pin);
    void logout();

    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================

    default String getRoleAkses() {
        return "Staff Biasa";
    }
}