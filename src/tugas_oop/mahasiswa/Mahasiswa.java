package tugas_oop.mahasiswa;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int angkatan;


    //CONSTRUCTOR
    public Mahasiswa(String nama, String jurusan, int angkatan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    // GETTER SETTER
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
}
