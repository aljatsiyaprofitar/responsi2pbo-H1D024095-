package pert4;

class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int poin;
    private String level;

    // TODO: Buat constructor dengan super
    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        // Memanggil constructor parent (Customer)
        super(nama, id, totalBelanja);
        // Mengisi atribut khusus Member
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}
