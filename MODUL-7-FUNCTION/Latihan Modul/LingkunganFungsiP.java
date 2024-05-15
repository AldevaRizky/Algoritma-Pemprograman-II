import java.util.Scanner;

public class LingkunganFungsiP {
    static double lingkaran(int r) {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran: " + luas);
        return luas;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = sc.nextInt();
        lingkaran(r);
    }
}
