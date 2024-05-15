import java.util.Scanner;

public class JenisBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        double bil = input.nextDouble();

        if (bil == 0) {
            System.out.println(bil + " adalah bilangan NOL");
        } else if (bil % 1 == 0) {
            System.out.println(bil + " adalah bilangan BULAT");
        } else {
            System.out.println(bil + " adalah bilangan PECAHAN");
        }
    }
}
