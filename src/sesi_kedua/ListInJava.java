package sesi_kedua;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {
        //LOGIC HERE

        List<String> names = new ArrayList<>();

        names.add("A"); // INDEX 0
        names.add("B"); // INDEX 1
        names.add("C"); // INDEX 2
        names.add("D"); // INDEX 3

        for (String name : names) {
//            System.out.println("Print element : " + name);
        }

        //Mengakses element dalam array secara manual menggunakan index
        String tampungNilaiDariIndexKeDua = names.get(2);

        System.out.println("Nilai dari index ke-2: " + tampungNilaiDariIndexKeDua);

        System.out.println("=======================================");

        //MENGHAPUS ELEMENT
        names.remove(2);
        System.out.println("Print element setelah dilakukan penghapusan : A" + names);
    }
}
