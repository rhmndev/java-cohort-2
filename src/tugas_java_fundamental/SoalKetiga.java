package tugas_java_fundamental;

import java.util.ArrayList;
import java.util.List;

public class SoalKetiga {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kartika");
        names.add("Fajri");
        names.add("Mayra");
        names.add("Syahra");

        for (String name : names) {
            System.out.println("Nama peserta : " + name);
        }
    }
}
