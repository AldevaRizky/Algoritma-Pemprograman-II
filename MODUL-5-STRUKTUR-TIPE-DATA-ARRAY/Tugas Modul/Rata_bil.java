import java.util.Scanner;

public class Rata_bil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak bilangan: ");
        int banyakBilangan = input.nextInt();

        int total = 0;
        int[] bilanganArray = new int[banyakBilangan]; // Menyimpan bilangan yang dimasukkan

        for (int i = 0; i < banyakBilangan; i++) {
            System.out.print("Masukkan data Bilangan ke-" + (i + 1) + ": ");
            int bilangan = input.nextInt();
            bilanganArray[i] = bilangan;
            total += bilangan;
        }

        double rataRata = (double) total / banyakBilangan;

        System.out.print("Nilai Rata-Rata dari bilangan ");
        for (int i = 0; i < banyakBilangan; i++) {
            System.out.print(bilanganArray[i]);
            if (i < banyakBilangan - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" adalah " + rataRata);
    }
}
