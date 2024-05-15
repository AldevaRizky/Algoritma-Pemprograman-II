class Hitung {
    void luas() {
        System.out.println("Menghitung luas bangun datar");
    }

    void keliling() {
        System.out.println("Menghitung keliling bangun datar");
    }
}

class Persegi extends Hitung {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    void luas() {
        super.luas();
        System.out.println("Luas persegi: " + (this.sisi * this.sisi));
    }

    @Override
    void keliling() {
        super.keliling();
        System.out.println("Keliling persegi: " + (this.sisi * 4));
    }
}

class Segitiga extends Hitung {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    void luas() {
        super.luas();
        System.out.println("Luas segitiga: " + (0.5 * this.alas * this.tinggi));
    }
}

class Lingkaran extends Hitung {
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    void luas() {
        super.luas();
        System.out.println("Luas lingkaran: " + (Math.PI * this.r * this.r));
    }

    @Override
    void keliling() {
        super.keliling();
        System.out.println("Keliling lingkaran: " + (2 * Math.PI * this.r));
    }
}

public class Poly1 {
    public static void main(String[] args) {
        Hitung hitung = new Hitung();
        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(6, 6);
        Lingkaran lingkaran = new Lingkaran(20);

        hitung.luas();
        hitung.keliling();

        persegi.luas();
        persegi.keliling();

        segitiga.luas();

        lingkaran.luas();
        lingkaran.keliling();
    }
}
