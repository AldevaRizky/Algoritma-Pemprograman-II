class Mahluk {
    public String nama;
    public String berjalan;
}

class Manusia extends Mahluk {
}

class Binatang extends Mahluk {
}

public class Inheritance {
    public static void main(String[] args) {
        Mahluk m = new Mahluk();
        m.nama = "Mahluk Hidup";
        m.berjalan = "Berjalan Menggunakan Kaki";
        System.out.println(m.nama);
        System.out.println(m.berjalan);
        System.out.println();

        Manusia mn = new Manusia();
        mn.nama = "Manusia Merupakan Mahluk Hidup";
        mn.berjalan = "Berjalan Menggunakan 2 kaki";
        System.out.println(mn.nama);
        System.out.println(mn.berjalan);
        System.out.println();

        Binatang b = new Binatang();
        b.nama = "Binatang merupakan mahluk hidup";
        b.berjalan = "Berjalan Menggunakan 4 kaki";
        System.out.println(b.nama);
        System.out.println(b.berjalan);
    }
}
