import java.util.Scanner;
public class Npmgenap {
    public static void main(String[] args) {
        // deklarasi variabel
        double gp, gt, tg;
        // input gaji & tunjangan
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Total Gaji           : ");
        gp = input.nextDouble();

            System.out.print("Masukkan Tunjangan            : ");
        gt = input.nextDouble();
        // rumus 
        tg = gp - gt;
            System.out.println("Total Gaji Anda Adalah        : " +tg);
        // percabangan else if
        if(tg > 0 && tg <= 3000000){
            System.out.println("Jabatan Anda Adalah           : Karyawan Biasa");
        } else if(tg > 3000000 && tg <= 5000000){
            System.out.println("Jabatan Anda Adalah           : Karyawan Tetap");
        } else if(tg > 5000000 && tg <= 10000000) {
            System.out.println("Jabatan Anda Adalah           : Pimpinan Cabang");
        } else {
            System.out.println("Gaji Anda Tidak Masuk Kriteria!!!");
        }
    }
}