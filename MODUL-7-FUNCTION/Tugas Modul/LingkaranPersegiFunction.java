import java.util.Scanner;

public class LingkaranPersegiFunction {
    static double hitungLuasLingkaran(int r) {
        double luas = Math.PI * r * r;
        return luas;
    }

    static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Luas Lingkaran dan Persegi Panjang");
        System.out.println("Pilihan:");
        System.out.println("1. Hitung Luas Lingkaran");
        System.out.println("2. Hitung Luas Persegi Panjang");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            int r = sc.nextInt();
            double luasLingkaran = hitungLuasLingkaran(r);
            System.out.println("Luas Lingkaran: " + luasLingkaran);
        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = sc.nextInt();
            int luasPersegi = hitungLuasPersegiPanjang(panjang, lebar);
            System.out.println("Luas Persegi Panjang: " + luasPersegi);
        } else {
            System.out.println("Pilihan salah.");
        }

        sc.close();
    }
}