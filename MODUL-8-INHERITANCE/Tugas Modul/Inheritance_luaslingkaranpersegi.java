import java.util.Scanner;

class BangunDatar {
    public float luas() {
        return 0;
    }
}

class Lingkaran extends BangunDatar {
    private float jariJari;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * jariJari * jariJari);
    }
}

class Persegi extends BangunDatar {
    private float panjang;
    private float tinggi;

    public Persegi(float panjang, float tinggi) {
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return panjang * tinggi;
    }
}

public class Inheritance_luaslingkaranpersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        float jariJari = scanner.nextFloat();
        Lingkaran lingkaran = new Lingkaran(jariJari);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());

        System.out.print("Masukkan panjang persegi: ");
        float panjang = scanner.nextFloat();
        System.out.print("Masukkan tinggi persegi: ");
        float tinggi = scanner.nextFloat();
        Persegi persegi = new Persegi(panjang, tinggi);
        System.out.println("Luas Persegi: " + persegi.luas());

        scanner.close();
    }
}
