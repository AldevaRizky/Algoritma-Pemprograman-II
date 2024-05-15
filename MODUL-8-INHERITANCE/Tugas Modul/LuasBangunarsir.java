import java.util.Scanner;

class BangunDatar {
    public float luas() {
        return 0;
    }
}

class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
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

class LuasBangun {
    private PersegiPanjang persegiPanjang;
    private Lingkaran lingkaran;

    public LuasBangun(PersegiPanjang persegiPanjang, Lingkaran lingkaran) {
        this.persegiPanjang = persegiPanjang;
        this.lingkaran = lingkaran;
    }

    public float hitungLuas() {
        float luasPersegiPanjang = persegiPanjang.luas();
        float luasLingkaran = lingkaran.luas();
        return luasPersegiPanjang - luasLingkaran;
    }
}

public class LuasBangunarsir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        float panjang = scanner.nextFloat();
        System.out.print("Masukkan lebar persegi panjang: ");
        float lebar = scanner.nextFloat();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        System.out.print("Masukkan jari-jari lingkaran: ");
        float jariJari = scanner.nextFloat();
        Lingkaran lingkaran = new Lingkaran(jariJari);

        LuasBangun luasBangun = new LuasBangun(persegiPanjang, lingkaran);
        float luas = luasBangun.hitungLuas();
        System.out.println("Luas Bangun (tanpa yang diarsir): " + luas);

        float luasLingkaran = lingkaran.luas();
        System.out.println("Luas Lingkaran (termasuk yang diarsir): " + luasLingkaran);

        scanner.close();
    }
}
