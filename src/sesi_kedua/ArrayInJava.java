package sesi_kedua;

public class ArrayInJava {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //TEKNIK 1 : FOR EACH untuk mengeluarkan isi ARRAY
        for (int number : numbers) {
            //System.out.println("Print element di dalam array numbers: " + number);
        }

        //TEKNIK 2 : FOR
        //1. Tahu dulu ukuran dari collection
        int ukuranArray = numbers.length;

        //buat program sederhana dengan teknik FOR
        for (int i = 0; i < ukuranArray; i++) {
            System.out.println("Print element di dalam array menggunkaan FOR: " + numbers[i]);
        }
    }
}
