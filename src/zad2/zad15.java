package zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytu:");
        String plikOdczytu = scanner.nextLine();
        System.out.println("Podaj nazwę pliku do zapisu:");
        String plikZapisu = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(plikOdczytu));
             FileWriter writer = new FileWriter(plikZapisu)) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                writer.write(linia.toUpperCase() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Błąd");
        }
    }
}
