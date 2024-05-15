import java.util.Scanner;

public class LingkaranProsedurParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bentuk yang ingin dihitung:");
        System.out.println("1. Segitiga");
        System.out.println("2. Lingkaran");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            hitungLuasSegitiga(alas, tinggi);
        } else if (pilihan == 2) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            hitungLuasLingkaran(jariJari);
        } else {
            System.out.println("Pilihan salah!");
        }
    }

    // Prosedur untuk menghitung luas segitiga
    public static void hitungLuasSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }

    // Prosedur untuk menghitung luas lingkaran
    public static void hitungLuasLingkaran(double jariJari) {
        double luas = Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas lingkaran: " + luas);
    }
}
