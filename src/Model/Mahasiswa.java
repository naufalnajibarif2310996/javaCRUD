package Model;

public class Mahasiswa extends Person implements ICetak {
    public Mahasiswa() {}
    public Mahasiswa(int id, String nama, String telepon, String alamat) {
        super(id, nama, telepon, alamat);
    }
    @Override
    public String getInfo() {
        return "Mahasiswa: " + getNama();
    }
    @Override
    public void cetakData() {
        System.out.println(getInfo() + ", Telepon: " + getTelepon() + ", Alamat: " + getAlamat());
    }
} 