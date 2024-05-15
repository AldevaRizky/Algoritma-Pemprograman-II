import java.util.Scanner;

public class gajiNPM {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double gp,tun,gk,pj,gb;
        System.out.print("Masukkan gaji pokok karyawan : ");
        gp=in.nextDouble();
        System.out.print("Masukkan tunjangan karyawan : ");
        tun=in.nextDouble();
        gk=gp+tun;
        pj=0.02;
        gb= gk-pj;
        System.out.print("Gaji bersih : "+gb);
    }
}
