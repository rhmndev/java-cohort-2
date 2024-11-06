package tugas_java_fundamental;

public class SoalKedua {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 9, 4, 3};
        
        int lengthOfNumbers = numbers.length;
        
        for (int i = 0; i <= lengthOfNumbers; i++) {
            if (numbers[i] == 4) {
                break;
            }
            System.out.println("Output : " + numbers[i]);
        }
    }
}
