package ćw1;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz 'Tak' lub 'Nie': ");
            String tekst = scanner.next();
            if (tekst.equals("Tak") || tekst.equals("Nie")) {
                System.out.println("Tekst jest poprawny");
                break;
            } else {
                System.out.println("Tekst jest nie poprawny spróbuj ponownie.");
            }
        }
        scanner.close();
    }
}

