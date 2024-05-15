import java.util.Scanner;

public class latwhilegenap {
     public static void main(String[]args){
         Scanner input=new Scanner(System.in);
        int num1 = 1;
        System.out.print("Masukkan sebuah bilangan : ");
        int num2 = input.nextInt();

        while (num2 <= 7) {
            int result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);

            num1 = result;
            num2++;
        }
    }
}
