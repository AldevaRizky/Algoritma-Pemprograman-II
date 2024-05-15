import java.util.Scanner;

public class BilPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bil = input.nextInt();
        boolean prima = true;

        if (bil <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= bil/2; i++) {
                if (bil % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println(bil + " adalah bilangan PRIMA");
        } else {
            System.out.println(bil + " adalah bukan bilangan PRIMA");
        }
    }
}
