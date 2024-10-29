package org.example;

public class Pemesanan implements Tiket {
    protected String nama;
    protected String asal;
    protected String tujuan;
    protected double hargatiket;
    protected double diskon;

    public Pemesanan(String nama, String asal, String tujuan, double hargatiket, double diskon) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargatiket = hargatiket;
        this.diskon = diskon;
    }

    @Override
    public double hitungBiayaTiket() {
        return hargatiket - (hargatiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return hargatiket * (diskon / 100);
    }

    @Override
    public void tampilkaninformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + hargatiket);
        System.out.println("Diskon:" + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}
