package org.example;
import java.util.Scanner;

public class PembelianTiketWisata {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nama = "", hari = "", jenisTiket = "", usia = "";
        int date = -1;
        double hargaTiket = 0;
        boolean validasi = false;

        while (!validasi) {
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan hari (misal: Senin, Sabtu, dll): ");
            hari = scanner.nextLine();

            do {
                System.out.print("Masukkan date: ");
                if (scanner.hasNextInt()) {
                    date = scanner.nextInt();

                    if (date <= 0 || date > 31) {
                        System.out.println("Tanggal harus antara 1 hingga 31, silakan masukkan ulang.");
                        date = -1;
                    }
                } else {
                    System.out.println("Input harus berupa angka.");
                    scanner.next();
                    date = -1;
                }
            } while (date < 0);
            scanner.nextLine();

            System.out.print("Masukkan jenis tiket (reguler/terusan): ");
            jenisTiket = scanner.nextLine();
            System.out.print("Masukkan usia (dewasa/anak-anak): ");
            usia = scanner.nextLine();

            if (nama.isEmpty() || hari.isEmpty() || jenisTiket.isEmpty() || usia.isEmpty()) {
                System.out.println("Data harus diisi, silakan isi ulang data yang kurang.");
            } else {
                validasi = true;
            }
        }

        if (jenisTiket.equalsIgnoreCase("reguler")) {
            if (usia.equalsIgnoreCase("dewasa")) {
                hargaTiket = 75000;
            } else if (usia.equalsIgnoreCase("anak-anak")) {
                hargaTiket = 60000;
            }
        } else if (jenisTiket.equalsIgnoreCase("terusan")) {
            if (usia.equalsIgnoreCase("dewasa")) {
                hargaTiket = 100000;
            } else if (usia.equalsIgnoreCase("anak-anak")) {
                hargaTiket = 85000;
            }
        }

        if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            hargaTiket += hargaTiket * 0.20;
        }

        // Output hasil
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + date);
        System.out.println("Total harga tiket: Rp" + hargaTiket);
    }
}
