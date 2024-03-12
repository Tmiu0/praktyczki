package zad2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku:");
        String nazwaPliku = scanner.nextLine();
        System.out.println("Podaj znak:");
        char znak = scanner.next().charAt(0);
        int licznik = 0;
        try {
            FileReader reader = new FileReader(nazwaPliku);
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == znak) {
                    licznik++;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
        }
        System.out.println("Liczba wystąpień znaku '" + znak + "' w pliku wynosi: " + licznik);
    }
}
