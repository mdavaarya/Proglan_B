package org.example;
import java.util.Scanner;

class IllegalPasswordException extends Exception {
    public IllegalPasswordException (String message) {
        super(message);
    }
}

public class Kegiatan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Masukkan password anda (ketik out untuk out): ");
            password = scanner.nextLine();

            if (password.equalsIgnoreCase("out")) {
                System.out.println(" ");
                break;
            }

            try {
                if (password.isEmpty()) {
                    throw new IllegalPasswordException("Password tidak boleh kosong");
                } else if (password.length() < 8) {
                    throw new IllegalPasswordException("Password tidak boleh kurang dari 8");
                } else if (!password.matches(".*[A-Z].*")) {
                    throw new IllegalPasswordException("Password harus mempunyai 1 huruf kapital");
                } else if (!password.matches(".*[a-z].*")) {
                    throw new IllegalPasswordException("Password harus mempunyai 1 huruf kecil");
                } else if (!password.matches(".*[0-9].*")) {
                    throw new IllegalPasswordException("Password harus mempunyai 1 angka");
                } else if (!password.matches(".*[!@#$%^&*].*")) {
                    throw new IllegalPasswordException("Password harus mempunyai 1 karakter khusus");
                }
                System.out.println("Password oke");

            } catch (IllegalPasswordException e) {
                System.out.println(" " + e.getMessage());
            }
        }
        scanner.close();
    }
}
