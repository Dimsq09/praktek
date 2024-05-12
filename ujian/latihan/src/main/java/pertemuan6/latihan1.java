package pertemuan6;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");
        int umur = inputNilaiInteger("umur");

        if (variabel1 < batasBawah) {
            System.out.println("Variabel1 = " + variabel1 + " kurang dari batasBawah yang bernilai " + batasBawah);
        } else if (variabel1 < batasAtas) {
            System.out.println("Variabel1 = " + variabel1 + " kurang dari batasBawah yang bernilai " + batasBawah +
                    " dan kurang dari batasAtas juga yang bernilai: " + batasAtas);
        } else if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara batasBawah dan batasAtas");
        }

        if (umur >= 50) {
            System.out.println("Anda sudah setengah baya, hati-hati dengan kulineran");
        }
    }

    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
}
