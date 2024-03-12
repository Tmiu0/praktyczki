package ćw1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz liczbę od 10 do 24: ");
            int liczba = scanner.nextInt();
            if (10 <= liczba && liczba <= 24) {
                System.out.println("Liczba jest poprawna");
                break;
            } else {
                System.out.println("Nie poprawna liczba spróbuj ponownie.");
            }
        }
        scanner.close();
    }
}
