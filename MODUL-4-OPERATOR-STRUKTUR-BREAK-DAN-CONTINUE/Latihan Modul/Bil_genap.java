import java.util.Scanner;

public class Bil_genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bil = input.nextInt();
        boolean genap = false;

        if (bil % 2 == 0) {
            genap = true;
        }

        if (genap) {
            System.out.println(bil + " adalah bilangan GENAP");
        } else {
            System.out.println(bil + " adalah bukan bilangan GENAP");
        }
    }
}
