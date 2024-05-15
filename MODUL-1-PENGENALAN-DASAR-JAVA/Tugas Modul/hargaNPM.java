import java.util.Scanner;

public class hargaNPM {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double hb,jb,dis,jh,toh;
    System.out.print("Masukkan Harga Barang : ");
    hb = input.nextDouble();
    System.out.print("Masukkan jumlah beli : ");
    jb = input.nextDouble();
    jh = hb*jb;
    dis = 0.05;
    toh = jh*dis;
    System.out.print("Total Bayar : "+toh);
}
}