package zad2;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szybkość pojazdu (w km/h):");
        int szybkosc = scanner.nextInt();
        System.out.println("Podaj liczbę godzin podróży:");
        int czas = scanner.nextInt();
        try {
            PrintWriter writer = new PrintWriter("odleglosc.txt", "UTF-8");
            writer.println("Godzina\tPrzebyta odległość");
            for (int i = 1; i <= czas; i++) {
                writer.println(i + "\t" + (szybkosc * i));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku.");
        }
    }
}

