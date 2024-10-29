package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinjaFruit {
    public static void main (String[] args) {
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka");

        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }

    public static int calculateTotalLength (List<String> words) {
        int totalLength = 0;
        for (int i= 0; i <= words.size() -1; i++) {     // tambahkan -1 agar tidak melebihi jumlah elemen yang ada pada array
            totalLength += words.get(i).length();
        }
        return totalLength;
    }

    public static String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            }                           // hapus else if karena dia mencari yang lebih kecil, langsung aja ke terpanjang
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) {
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            capitalized.add(word.substring(0).toUpperCase());  // mulai dari 0 ya kak, tidak mungkin huruf pertama kecil tapi huruf kedua tiba-tba kapital
        }
        return capitalized;
    }

    public static List<Integer> wordLengths(List<String> words) {
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length()); // hapus kondisi if, karena jika null apa yang perlu diperiksa
        }
        return lengths;
    }
}
