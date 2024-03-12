package zad2;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WYKRES SŁUPKOWY");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Wartość dla sklepu nr " + i + ": ");
            int sprzedaz = scanner.nextInt();
            System.out.print("Sklep nr " + i + ": ");
            for (int j = 0; j < sprzedaz / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
