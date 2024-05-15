public class TampilParameter {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Ahmad Khomaeni");
        mhs.setAlamat("Jl. Auri No.14");
        mhs.setKodePos("55283");

        tampilInformasi(mhs);
    }

    // Prosedur untuk menampilkan informasi mahasiswa (nama, alamat, dan kode pos)
    public static void tampilInformasi(Mahasiswa mahasiswa) {
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Kode Pos: " + mahasiswa.getKodePos());
    }
}

class Mahasiswa {
    private String nama;
    private String alamat;
    private String kodePos;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }
}
