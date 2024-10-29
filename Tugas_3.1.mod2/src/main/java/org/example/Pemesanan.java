package org.example;

public class Pemesanan implements Tiket {
    protected String nama;
    protected String asal;
    protected String tujuan;
    protected double Tiket;
    protected double diskon;

    public Pemesanan(String nama, String asal, String tujuan, double Tiket, double diskon) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.Tiket = Tiket;
        this.diskon = diskon;
    }

    @Override
    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    @Override
    public void tampilkaninformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}
