package tugas_oop;

// TUGAS PROGRAM 1
public class Mahasiswa1 {
    public String nama;
    public String jurusan;
    public int angkatan;

    public static void main(String[] args) {
        // Memberikan nilai melalui PARAMETERIZED CONSTRUCTOR
        Mahasiswa1 dataMhs = new Mahasiswa1("Rahman Nurhadi", "Informatika", 2022);

        // Ouput
        infoMahasiswa(dataMhs);
    }

    // OVERLOAD CONSTRUCTOR : Menampung lebih dari satu properti
    public Mahasiswa1(String nama, String jurusan, int angkatan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    // Method Static
    public static void infoMahasiswa(Mahasiswa1 mahasiswa) {
        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("Jurusan: " + mahasiswa.jurusan);
        System.out.println("Angkatan: " + mahasiswa.angkatan);
    }

}
