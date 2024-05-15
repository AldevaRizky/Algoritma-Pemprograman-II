import java.util.Scanner;

public class SoalFungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        double totalNilai = hitungTotalNilai(nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("Jumlah Nilai = " + totalNilai);
    }

    public static double hitungTotalNilai(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        double bobotTugas = 0.3;
        double bobotUTS = 0.3;
        double bobotUAS = 0.4;

        double totalNilai = (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);

        return totalNilai;
    }
}
