package tugas_methodAndFunction;

public class VolumeCalculator {
    public static void main(String[] args) {

        // KUBUS
        System.out.println("Volume Kubus : " + volumeCalculate(13, 13, 13));

        // BALOK
        System.out.println("Volume Balok : " + volumeCalculate(15, 12, 10));

        // SILINDER/TABUNG
        System.out.println("Volume Silinder : " + String.format("%.2f", volumeCalculate(8, 12)));

    }

    public static double volumeCalculate(Integer sisi1, Integer sisi2, Integer sisi3) {
        return sisi1 * sisi2 * sisi3;
    }

    public static double volumeCalculate(Byte panjang, Byte lebar, Byte tinggi) {
        return panjang * lebar * tinggi;
    }

    public static double volumeCalculate(double jari2, double height) {
        return  Math.PI * Math.pow(jari2, 2) * height;
    }

}
