class Inap {
    private String kamar;
    private double harga;

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKamar() {
        return kamar;
    }

    public double getHarga() {
        return harga;
    }
}

public class hotel {
    public static void main(String[] args) {
        Inap data = new Inap();
        data.setKamar("504");
        data.setHarga(250000.0);
        System.out.println("Nomor kamar: " + data.getKamar());
        System.out.println("Harga kamar: Rp." + data.getHarga());
    }
}
