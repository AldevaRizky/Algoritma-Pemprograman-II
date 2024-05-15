import java.util.Scanner;

public class Contohwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, total = 0, bil = 9;

        while (bil != 0) {
            n++;
            System.out.print("Input bilangan ke-" + n + " : ");
            bil = input.nextInt();
            total += bil;
        }

        System.out.println("Total jumlah " + (n - 1) + " bilangan: " + total);
    }
}
