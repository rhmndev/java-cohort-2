package tugas_java_fundamental;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoalKeempat {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<String> name = Arrays.asList("Rahman", "Azhari", "Eri", "Janu");

        List<Integer> evenNumbers = numbers.stream()
                .filter(angka -> angka % 2 == 0 )
                .map(angka -> angka * 4)
                .collect(Collectors.toList());
        System.out.println("Angka genap yang dikalikan 4 : " + evenNumbers);



    }
}
