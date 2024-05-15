import java.util.Scanner;

public class LingkaranProsedur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Panggil prosedur hitungLuasLingkaran dengan parameter jariJari
        hitungLuasLingkaran(jariJari);
    }

    // Prosedur untuk menghitung luas lingkaran
    public static void hitungLuasLingkaran(double jariJari) {
        double luas = Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas Lingkaran: " + luas);
    }
}
