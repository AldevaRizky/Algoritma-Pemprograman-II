public class Poly {
    static double hitungNilai(double a, double b) {
        double c = a + b;
        return c;
    }

    static int hitungNilai(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(hitungNilai(5.5, 7.5));
        System.out.println(hitungNilai(10, 20));
    }
}
