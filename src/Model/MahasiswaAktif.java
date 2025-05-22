package Model;

public class MahasiswaAktif extends Mahasiswa {
    private String status = "Aktif";
    public MahasiswaAktif(int id, String nama, String telepon, String alamat) {
        super(id, nama, telepon, alamat);
    }
    @Override
    public String getInfo() {
        return "Mahasiswa Aktif: " + getNama() + " (" + status + ")";
    }
} 