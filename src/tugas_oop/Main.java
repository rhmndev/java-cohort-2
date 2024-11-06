package tugas_oop;

import tugas_oop.mahasiswa.Mahasiswa;
import tugas_oop.mahasiswa.MahasiswaService;
import tugas_oop.mahasiswa.MahasiswaServiceImpl;

// TUGAS PROGRAM 2
public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs = setServiceMahasiswa();

        MahasiswaService mhsService = new MahasiswaServiceImpl();
        mhsService.save(mhs);
    }
    private static Mahasiswa setServiceMahasiswa() {
        Mahasiswa mhs = new Mahasiswa("Rahman Nurhadi", "Informatika", 2022);

        String name = mhs.getNama();
        String major = mhs.getJurusan();
        int academicYear = mhs.getAngkatan();

        System.out.println("Nama : " + name);
        System.out.println("Jurusan : " + major);
        System.out.println("Angkatan : " + academicYear);
        return mhs;
    }
 }
