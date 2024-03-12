package ćw1;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz literę 'T', 't', 'N' lub 'n': ");
            char litera = scanner.next().charAt(0);
            if (litera == 'T' || litera == 't' || litera == 'N' || litera == 'n') {
                System.out.println("Wprowadzona litera jest poprawna");
                break;
            } else {
                System.out.println("Nie poprawna litera spróbuj ponownie.");
            }
        }
        scanner.close();
    }
}
