package zad2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę przepracowanych dni:");
        int dni = scanner.nextInt();
        double zarobek = 0.01;
        double suma = 0;
        System.out.println("Dzień\tZarobek");
        for (int i = 1; i <= dni; i++) {
            System.out.println(i + "\t" + zarobek);
            suma += zarobek;
            zarobek *= 2;
        }
        System.out.println("Sumaryczna zapłata za cały okres wynosi: " + suma + " zł");
    }
}

