package zad2;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią niezerową liczbę całkowitą:");
        int liczba = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= liczba; i++) {
            suma += i;
        }
        System.out.println("Suma liczb od 1 do " + liczba + " wynosi: " + suma);
    }
}

