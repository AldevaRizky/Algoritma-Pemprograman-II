import java.util.Scanner;

public class lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai anda : ");
        nilai = input.nextInt();

        if (nilai < 50) {
            System.out.println("Anda tidak LULUS");
        } else {
            System.out.println("Anda LULUS");
        }
    }
}
