package zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku:");
        String nazwaPliku = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            int numerWiersza = 1;
            while ((linia = reader.readLine()) != null) {
                System.out.println(numerWiersza + ": " + linia);
                numerWiersza++;
            }
        } catch (IOException e) {
            System.out.println("Błąd.");
        }
    }
}

