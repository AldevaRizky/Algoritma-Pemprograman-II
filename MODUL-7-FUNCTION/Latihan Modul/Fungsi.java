import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        MHS s = new MHS();
        inputInformasi(s);
        tampilInformasi(s);
    }

    // Fungsi untuk menginputkan informasi NIM, nama, dan alamat mahasiswa
    public static void inputInformasi(MHS mahasiswa) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        mahasiswa.setNim(nim);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        mahasiswa.setNama(nama);

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        mahasiswa.setAlamat(alamat);
    }

    // Prosedur untuk menampilkan informasi mahasiswa (NIM, nama, dan alamat)
    public static void tampilInformasi(MHS mahasiswa) {
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}

class MHS {
    private String nim;
    private String nama;
    private String alamat;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
