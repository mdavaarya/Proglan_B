package org.example;
public class TiketPesawat extends Pemesanan {

    public TiketPesawat(info info) {
        super(info.nama(), info.asal(), info.tujuan(), info.Tiket(), info.diskon());
    }

}
