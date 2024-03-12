package zad2;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pięter:");
        int pietra = scanner.nextInt();
        int lacznaLiczbaPokojow = 0;
        int lacznaLiczbaZajetychPokojow = 0;
        for (int i = 1; i <= pietra; i++) {
            System.out.println("Pokoje na piętrze " + i + ":");
            int liczbaPokojow = scanner.nextInt();
            System.out.println("Liczba zajętych pokoi " + i + ":");
            int liczbaZajetychPokojow = scanner.nextInt();
            lacznaLiczbaPokojow += liczbaPokojow;
            lacznaLiczbaZajetychPokojow += liczbaZajetychPokojow;
        }
        double poziomOblozenia = (double) lacznaLiczbaZajetychPokojow / lacznaLiczbaPokojow;
        System.out.println("Łączna liczba pokojów w hotelu: " + lacznaLiczbaPokojow);
        System.out.println("Liczba zajętych pokojów: " + lacznaLiczbaZajetychPokojow);
        System.out.println("Liczba pustych pokojów: " + (lacznaLiczbaPokojow - lacznaLiczbaZajetychPokojow));
        System.out.println("Poziom obłożenia: " + poziomOblozenia);
    }
}

