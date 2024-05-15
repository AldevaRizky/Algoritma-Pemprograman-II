import java.util.Scanner;

public class RataRataBilangan_NPMgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahData = 5;
        int[] data = new int[jumlahData];

        System.out.println("Masukkan nilai dari kelima data:");

        // Mengisi data
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Menghitung total
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            total += data[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlahData;

        System.out.println("Data yang dimasukkan:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + data[i]);
        }

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
