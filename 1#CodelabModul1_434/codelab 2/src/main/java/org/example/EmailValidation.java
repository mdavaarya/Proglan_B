package org.example;

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException (String message){
        super(message);
    }
}
public class EmailValidation {
    public static void validatedEmail(String email) throws InvalidEmailException {
        if (!email.contains("@webmail.umm.ac.id")) {
            throw new InvalidEmailException("Alamat email harus mengandung '@webmail.umm.ac.id'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidEmail = false;

        while (!isValidEmail) {
            System.out.print("Masukkan alamat email anda (harus mengandung '@webmail.umm.ac.id'): ");

            String email = scanner.nextLine().trim();

            try{
                validatedEmail(email);
                isValidEmail = true;
                System.out.println("Alamat email anda adalah: " + email);
            }catch (InvalidEmailException e){
                System.out.println("Kesalahan validasi email: " +  e.getMessage());
                System.out.println("Silahkan coba lagi.");

            }


        }
    }
}



