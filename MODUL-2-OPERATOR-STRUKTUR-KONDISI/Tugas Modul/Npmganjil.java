import java.util.Scanner;

public class Npmganjil {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Total Gaji : ");
        double tg = input.nextDouble();
        System.out.print("Masukkan Tunjangan : ");
        double tun = input.nextDouble();
        if (tg-tun<=3000000)
            System.out.print("Karyawan");
        else if (tg-tun<=4500000)
            System.out.print("Supervisor");
        else if (tg-tun>4500000)
            System.out.print("Manager");
    }
}
