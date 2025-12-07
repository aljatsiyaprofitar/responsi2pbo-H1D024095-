package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");
        System.out.println("--- PESAWAT TEMPUR ---");
        astraFury.aktifkanMesin();
        astraFury.jelajah(10);
        astraFury.jelajah(30);
        astraFury.tembakRudal(3);
        astraFury.tampilStatus();
        System.out.println();


        System.out.println("--- KAPAL EKSPLORASI ---");
        voyagerX.aktifkanMesin();
        voyagerX.jelajah(15);
        voyagerX.scanPlanet("Kepler-442b");
        voyagerX.tampilStatus();

    }
}
