import java.util.Scanner;

class PenyewaanGedung {
    private double hargaGedung;
    private int lamaSewa;

    public void setHargaGedung(double hargaGedung) {
        this.hargaGedung = hargaGedung;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getHargaGedung() {
        return hargaGedung;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double hitungTotalPembayaran() {
        return hargaGedung * lamaSewa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PenyewaanGedung data = new PenyewaanGedung();

        System.out.print("Masukkan harga gedung per hari: ");
        double hargaGedung = scanner.nextDouble();
        data.setHargaGedung(hargaGedung);

        System.out.print("Masukkan lama sewa gedung (dalam hari): ");
        int lamaSewa = scanner.nextInt();
        data.setLamaSewa(lamaSewa);

        System.out.println("Harga gedung per hari: Rp." + data.getHargaGedung());
        System.out.println("Lama sewa gedung: " + data.getLamaSewa() + " hari");
        System.out.println("Total pembayaran: Rp." + data.hitungTotalPembayaran());

        scanner.close();
    }
}
