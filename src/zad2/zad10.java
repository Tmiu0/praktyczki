package zad2;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int najwieksza = Integer.MIN_VALUE;
        int najmniejsza = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Podaj liczbę całkowitą (wpisz -99, aby zakończyć):");
            int liczba = scanner.nextInt();
            if (liczba == -99) {
                break;
            }
            if (liczba > najwieksza) {
                najwieksza = liczba;
            }
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
        }
        System.out.println("MAX: " + najwieksza);
        System.out.println("MIN: " + najmniejsza);
    }
}
