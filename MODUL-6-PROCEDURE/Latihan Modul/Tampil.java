import java.util.Scanner;

class MHS {
    String NIM;
    String Nama;
    String Alamat;

    public void ambil_nim(){
        System.out.println("NIM mahasiswa: " + NIM);
    }

    public void ambil_nama(){
        System.out.println("Nama mahasiswa: " + Nama);
    }

    public void ambil_alamat(){
        System.out.println("Alamat mahasiswa: " + Alamat);
    }
}

public class Tampil {
    public static void main(String[] args) {
        MHS mhs = new MHS();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        mhs.NIM = input.nextLine();

        System.out.print("Masukkan Nama: ");
        mhs.Nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        mhs.Alamat = input.nextLine();

        mhs.ambil_nim();
        mhs.ambil_nama();
        mhs.ambil_alamat();
    }
}
