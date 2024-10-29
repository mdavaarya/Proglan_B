package org.example;

public class Menu {
    private String nama;
    private int harga;
    public Menu(String nama, int harga) {
        this.setNama(nama);
        this.setHarga(harga);
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
