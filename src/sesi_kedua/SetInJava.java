package sesi_kedua;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[ ] args) {
        //LOGIC HERE

        Set<String> huruf = new HashSet<String>();
        huruf.add("A");
        //huruf.add("B");
        huruf.add("B");
        //huruf.add("C");
        huruf.add("C");
        huruf.add("D");

        for (String output : huruf) {
            System.out.println("Print element di dalam Set : " + output);
        }

        int ukuranCollectionSet = huruf.size();
    }
}
