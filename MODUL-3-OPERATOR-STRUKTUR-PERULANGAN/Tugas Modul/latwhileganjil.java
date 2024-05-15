public class latwhileganjil {
    public static void main(String[]args){
        int num1 = 1;
        int num2 = 2;

        while (num2 <= 7) {
            int result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);

            num1 = result;
            num2++;
        }
    }
}
