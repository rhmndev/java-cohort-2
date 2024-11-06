package sesiketiga;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MethodStatic {
    public static void main(String[] args) {
        checkNumber();

        List<String> namaSiswa = Arrays.asList("Rahman", "Akmal", "Reni", "Joshua");
        int output = checkLength(namaSiswa);

        System.out.println(output);
    }

        // method yang memiliki kata "void" adalah method yang tidak memiliki nilai kembalian atau return value
        //dibawah ini method yang tidak memiliki parameter
        public static void checkNumber() {
            //BLOK KODE/BUAT LOGIC
            int number  = 10;

            if (number < 10) {
                System.out.println("Output A");
            } else {
                System.out.println("Output B");
            }
        }


        public static void checkNumber(String parameter1) {}

        public static void checkNumber(int parameter1) {}

        public static void checkNumber(String parameter1, boolean parameter2) {}

        public static void checkNumber(Map<String, Integer> parameter1, List<Integer> parameter2) {}






        // dibawah ini adalah method yang memiliki nilai kembalian/return value
        // ini adalah method yang memiliki parameter
        public static int checkLength(List<String> siswa) {
            int size = siswa.size();

            return size;
        }

        public void testPanggilDariKelasLain() {

        }

    }
