package sesiketiga;

import java.util.Arrays;
import java.util.List;

public class MethodNonStatic {
    public static void main(String[] args) {
        MethodNonStatic objectClassMethodNonStatic = new MethodNonStatic();
        objectClassMethodNonStatic.checkNumber();

        List<String> namaSiswa = Arrays.asList("Rahman", "Akmal", "Reni", "Joshua");
        objectClassMethodNonStatic.checkLength(namaSiswa);

        MethodStatic object = new MethodStatic();
        object.testPanggilDariKelasLain();
    }

    public void checkNumber() {
        //BLOK KODE/BUAT LOGIC
        int number  = 10;

        if (number < 10) {
            System.out.println("Output A");
        } else {
            System.out.println("Output B");
        }
    }

    public static int checkLength(List<String> siswa) {
        int size = siswa.size();
        return size;
    }
}
