import java.util.Scanner;

class Inap {
    private String nomorKamar;
    private double hargaKamar;
    private int lamaMenginap;

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHargaKamar() {
        return hargaKamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public double hitungTotalPembayaran() {
        return hargaKamar * lamaMenginap;
    }
}

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inap data = new Inap();

        System.out.print("Masukkan nomor kamar: ");
        String nomorKamar = scanner.nextLine();
        data.setNomorKamar(nomorKamar);

        System.out.print("Masukkan harga kamar per malam: ");
        double hargaKamar = scanner.nextDouble();
        data.setHargaKamar(hargaKamar);

        System.out.print("Masukkan lama menginap (dalam hari): ");
        int lamaMenginap = scanner.nextInt();
        data.setLamaMenginap(lamaMenginap);

        System.out.println("Nomor kamar: " + data.getNomorKamar());
        System.out.println("Harga kamar per malam: Rp." + data.getHargaKamar());
        System.out.println("Lama menginap: " + data.getLamaMenginap() + " hari");
        System.out.println("Total pembayaran: Rp." + data.hitungTotalPembayaran());

        scanner.close();
    }
}
