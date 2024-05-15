class Bangun {
    float alas, tinggi, sisi;

    public void tampilLuas() {
        System.out.println("Menghitung Luas Segitiga");
    }

    public void tampilKeliling() {
        System.out.println("Menghitung Keliling Segitiga");
    }

    float luas() {
        return 0;
    }

    float keliling() {
        return 0;
    }
}

class Segitiga extends Bangun {
    @Override
    float luas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 3 * sisi;
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;
    }
}

public class InheritanceTry {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.alas = 10;
        s.tinggi = 5;
        s.sisi = 20;
        s.tampilLuas();
        s.luas();
        System.out.println();
        s.tampilKeliling();
        s.keliling();
    }
}
