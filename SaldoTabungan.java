package pert6;
import java.util.Scanner;

public class SaldoTabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: Rp ");
        double saldo = input.nextDouble();

        System.out.print("Masukkan bunga per bulan (%): ");
        double bungaPerBulan = input.nextDouble();

        System.out.print("Masukkan lama periode (bulan): ");
        int lamaBulan = input.nextInt();

        System.out.println("\nSaldo bulanan:");

        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldo += saldo * (bungaPerBulan / 100);
            System.out.printf("Saldo di bulan ke-%d: Rp %.2f%n", bulan, saldo);
        }
    }
}
