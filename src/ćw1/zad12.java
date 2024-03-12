package ćw1;

public class zad12 {
    public static void main(String[] args) {
        double suma = 0;
        for (int i = 1, j = 30; i <= 30 && j >= 1; i++, j--) {
            suma += (double) i / j;
        }
        System.out.println("Suma ciągu liczb to: " + suma);
    }
}

