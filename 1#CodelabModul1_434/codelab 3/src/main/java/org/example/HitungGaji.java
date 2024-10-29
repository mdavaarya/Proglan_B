package org.example;
public class HitungGaji {
    public int perhitunganGaji(int jamKerja, int UpahPerJam) {
        if (jamKerja < 0 || UpahPerJam < 0) {
            throw new IllegalArgumentException("Jam kerja dan gaji per jam tidak boleh negatif");
        }
        return jamKerja * UpahPerJam;
    }
    public static void main(String[] args) {
        HitungGaji totalGaji = new HitungGaji();
        long gajiTotal = totalGaji.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = "+gajiTotal);
    }
}

// saya mengubah perhitungan gaji dari yang awalnya menggunakan iterasi menggunakan perkalian
// saya menambahkan handling exeption untuk jam kerja dan upah tidak boleh diberi minus dibelakang angka

// saya sedikit menyesuaikan nama agar lebih konsisten dan jelas
// menghapus variabel gajitotal karena saya mengubah iterasi -> perkalian
// mengubah gajiperjam ->  UpahPerJam
// mengubah Hitung -> totalGaji