package zad2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba organizmów:");
        double organizmy = scanner.nextDouble();
        System.out.println("Średni przyrost dzienny:");
        double przyrost = scanner.nextDouble();
        System.out.println("Liczba dni rozmnażania:");
        int dni = scanner.nextInt();
        for (int i = 1; i <= dni; i++) {
            System.out.println("Dzień " + i + ": " + organizmy);
            organizmy += organizmy * przyrost / 100;
        }
    }
}

