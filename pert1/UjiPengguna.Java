package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dan isi datanya sesuai data uji coba
        Pengguna p = new Pengguna();

        p.umur = 25;
        p.berat = 60;
        p.tinggi = 170;

        // Panggil method tampilInfo
        p.tampilInfo();

        // Tampilkan demonstrasi tentang konstanta final
        //p.faktorAktivitas = 1.5;
    }
}