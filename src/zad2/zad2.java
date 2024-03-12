package zad2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szybkość pojazdu (w km/h):");
        int szybkosc = scanner.nextInt();
        System.out.println("Podaj liczbę godzin podróży:");
        int czas = scanner.nextInt();
        System.out.println("Godzina\t Przebyta odległość");
        for (int i = 1; i <= czas; i++) {
            System.out.println(i + "\t" + (szybkosc * i));
        }
    }
}

