package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WarungMakan {
    public static final int HARGA_NASI_GORENG = 15000;
    public static final int HARGA_AYAM_BAKAR = 20000;
    public static final int HARGA_SOTO_AYAM = 12000;
    public static final int HARGA_ESTEH = 5000;
    public static final int HARGA_ESJERUK = 7000;
    private static ArrayList<Menu> daftarMenu = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        daftarMenu.add(new Menu("Nasi Goreng", HARGA_NASI_GORENG));
        daftarMenu.add(new Menu("Ayam Bakar", HARGA_AYAM_BAKAR));
        daftarMenu.add(new Menu("Soto Ayam", HARGA_SOTO_AYAM));
        daftarMenu.add(new Menu("Es Teh", HARGA_ESTEH));
        daftarMenu.add(new Menu("Es Jeruk", HARGA_ESJERUK));
        System.out.println("Selamat datang di Warung Makan!");
        DisplayMenu();

        ArrayList<Menu> pesanan = new ArrayList<>();
        while (true) {
            System.out.print("Masukkan nomor menu yang ingin dipesan (0 untuk selesai): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                break;
            } else if (pilihan > 0 && pilihan <= daftarMenu.size()) {
                pesanan.add(daftarMenu.get(pilihan - 1));
                System.out.println(daftarMenu.get(pilihan - 1).getNama() + " telah ditambahkan.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        displayOrderSummary(pesanan);
        scanner.close();
    }

    public static void DisplayMenu() {
        System.out.println("\nDaftar Menu:");
        System.out.println("Harga pasti murah meriah");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i).getNama() + " - Rp " + daftarMenu.get(i).getHarga());
        }
    }

    public static void displayOrderSummary (ArrayList<Menu> pesanan) {
        System.out.println("\nRingkasan Pesanan:");
        int total = 0;
        System.out.println("Total yang harus dibayar: Rp " + Totalbayar(pesanan, total));
        System.out.println("Terima kasih telah memesan!");
    }

    private static int Totalbayar(ArrayList<Menu> pesanan, int total) {
        for (Menu item : pesanan) {
            System.out.println(item.getNama() + " - Rp " + item.getHarga());
            total += item.getHarga();
        }
        return total;
    }
}
