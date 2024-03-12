package zad2;

import java.util.Random;
import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Random random = new Random();
        int liczbaLosowa = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int liczbaProb = 0;
        while (true) {
            System.out.println("Odgadnij liczbę:");
            int liczba = scanner.nextInt();
            liczbaProb++;
            if (liczba > liczbaLosowa) {
                System.out.println("Za duża liczba");
            } else if (liczba < liczbaLosowa) {
                System.out.println("Za mała liczba");
            } else {
                System.out.println("Odgadłeś liczbę!");
                System.out.println("Liczba prób: " + liczbaProb);
                break;
            }
        }
    }
}
