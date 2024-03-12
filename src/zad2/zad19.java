package zad2;

import java.util.Random;
import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
        String[] kolory = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int liczbaPoprawnychWskazan = 0;
        for (int i = 0; i < 10; i++) {
            int wybranyKolor = random.nextInt(kolory.length);
            System.out.println("Podaj kolor wybrany przez komputer:");
            String kolor = scanner.nextLine();
            if (kolor.equalsIgnoreCase(kolory[wybranyKolor])) {
                liczbaPoprawnychWskazan++;
            }
            System.out.println("Losowo wybrany kolor: " + kolory[wybranyKolor]);
        }
        System.out.println("Liczba poprawnych wskazań: " + liczbaPoprawnychWskazan);
    }
}
