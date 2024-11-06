package sesi_kedua;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
    public static void main(String[] args) {
        //LOGIC HERE

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        //KEY SET
        for (Integer key : map.keySet()) {
            System.out.println("Key : " + key + " Value adalah : " + map.keySet());
        }
        //ENTRY SET
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value adalah : " + entry.getKey());

        }

        //JAVA LAMBDA
        map.forEach((a, b) -> System.out.println("Key : " + a + " Value adalah : " + b));
    }
}
