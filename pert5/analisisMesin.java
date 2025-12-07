package pert5;

class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] inventaris = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        // Isi array dengan objek mesinTraktor
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        // Isi array dengan objek mesinTraktorListrik
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin m : inventaris) {
            m.tampilInfo();

        // Loop untuk menampilkan kategori dan performa
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            }
            else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
            else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin juara = inventaris[0];
        for (int i = 1; i < inventaris.length; i++) {
            if (inventaris[i].nilaiPerforma() > juara.nilaiPerforma()) {
                juara = inventaris[i];
            }
        }
        System.out.println(juara.namaMesin + " -> " + juara.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        defaultMesin[] sortedList = inventaris.clone();
        for (int i = 0; i < sortedList.length - 1; i++) {
            for (int j = 0; j < sortedList.length - i - 1; j++) {
                if (sortedList[j].nilaiPerforma() < sortedList[j + 1].nilaiPerforma()) {
                    defaultMesin temp = sortedList[j];
                    sortedList[j] = sortedList[j + 1];
                    sortedList[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + sortedList[i].namaMesin + " -> " + sortedList[i].nilaiPerforma());
        }
    }
}
