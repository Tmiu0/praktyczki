package zad2;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Miesięczny budżet:");
        double budzet = scanner.nextDouble();
        double sumaWydatkow = 0;
        String odpowiedz;
        do {
            System.out.println("Wydatek:");
            double wydatek = scanner.nextDouble();
            sumaWydatkow += wydatek;
            System.out.println("Czy chcesz podać kolejny wydatek? (tak/nie)");
            odpowiedz = scanner.next();
        } while (odpowiedz.equalsIgnoreCase("tak"));
        double roznica = budzet - sumaWydatkow;
        System.out.println("Różnica wynosi: " + roznica);
    }
}
