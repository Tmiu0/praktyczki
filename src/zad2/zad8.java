package zad2;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lata  :");
        int lata = scanner.nextInt();
        double sumaOpadow = 0;
        for (int i = 1; i <= lata; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("Centymetry opadów w miesiącu " + j + " roku " + i + ":");
                double opady = scanner.nextDouble();
                sumaOpadow += opady;
            }
        }
        double srednieOpady = sumaOpadow / (lata * 12);
        System.out.println("Liczba miesięcy: " + (lata * 12));
        System.out.println("Łączna liczba centymetrów opadów: " + sumaOpadow);
        System.out.println("Średni pozom opadów: " + srednieOpady);
    }
}
