import java.util.Scanner;

public class Kendaraan {
    public static void main(String[] args){
        System.out.println("Pilihan 1: Sepeda Motor");
        System.out.println("Pilihan 2: Bus");
        System.out.println("Pilihan 3: Mobil");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan Kendaraan Favorit anda: ");
        int bil=input.nextInt();

        switch (bil){
            case 1: System.out.println("Sepeda Motor");
            break;

            case 2: System.out.println("Bus");
            break;

            case 3: System.out.println("Mobil");
            break;

            default:System.out.println("Pilihan anda Tidak ada");
        }
    }
}