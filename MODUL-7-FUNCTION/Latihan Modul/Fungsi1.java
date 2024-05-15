import java.util.Scanner;

class Fungsi1 {
    static int hitungLuas() {
        int p, l, luas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang = ");
        p = sc.nextInt();
        System.out.print("Lebar = ");
        l = sc.nextInt();
        luas = p * l;
        System.out.println("Luas Persegi = " + luas);
        return luas;
    }

    public static void main(String[] args) {
        hitungLuas();
    }
}
