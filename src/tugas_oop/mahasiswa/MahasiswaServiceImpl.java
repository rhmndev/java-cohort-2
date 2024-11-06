package tugas_oop.mahasiswa;

public class MahasiswaServiceImpl implements MahasiswaService {

    @Override
    public String save(Mahasiswa mahasiswa) {
        if (mahasiswa.getNama().isBlank()) {
            return "Please, input student name";
        } else {
            // save to database
            return "SUCCESS";
        }


    }
}
