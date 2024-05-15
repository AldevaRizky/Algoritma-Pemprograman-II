import java.util.Scanner;
public class persegipanjang {
    public static void main(String[]args)  
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang : ");
        double panjang = input.nextInt();

        System.out.print("Masukkan Lebar   :");
        double lebar = input.nextInt();

        System.out.println("Luas Persegi Panjang :" + (panjang * lebar));
    }
}