import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta input dari pengguna
        System.out.print("Inputkan Batas Jumlah Bilangan: ");
        int batas = input.nextInt();

        // Cetak deret bilangan ganjil
        System.out.print("Deret Bilangan Ganjil adalah: ");
        for (int angka = 1; angka <= batas; angka += 2) {
            System.out.print(angka + " ");
        }
    }
}
