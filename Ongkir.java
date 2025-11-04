package byannalfr;

import java.util.Scanner;

public class Ongkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input berat paket (kg)
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        // Input jarak tempuh (km)
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        // Input dimensi paket (cm)
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();
        // Hitung volume paket (cm³)
        double volume = panjang * lebar * tinggi;
        // Hitung biaya berdasarkan berat dan jarak
        double biayaBerat;
        if (jarak <= 10) {
            biayaBerat = berat * 4250;
        } else {
            biayaBerat = berat * 6000;
        }
        // Hitung biaya volume
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }
        // Hitung total ongkir
        double totalBiaya = biayaBerat + biayaVolume;
        System.out.println("Biaya pengiriman total: Rp " + (int) totalBiaya);
        scanner.close();

    }
}

