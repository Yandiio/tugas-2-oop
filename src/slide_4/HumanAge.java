package slide_4;

import java.util.Scanner;

/**
 * @author Yandi Fenanda
 * @createdOn 14/03/23 Tuesday
 */
public class HumanAge {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;
        String kategori = null;

        // input data
        System.out.println("Masukan umur anda:\t");
        usia = input.nextInt();
        if (usia < 5) {
            kategori = "balita";
        } else if (usia <= 5 || usia < 12) {
            kategori = "anak-anak";
        } else if (usia <= 12 || usia < 18) {
            kategori = "remaja";
        } else if (usia <= 18 || usia < 40) {
            kategori = "dewasa";
        } else if (usia <= 40 || usia < 60) {
            kategori = "paruhbaya";
        } else if (usia >= 60) {
            kategori = "lanjut usia";
        }


        System.out.println("Anda tergolong sebagai: " + kategori);
    }
}
