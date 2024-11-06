package sesi_pertama;

public class DataType {

    //Tipe data primitif
    //1. Diawali dengan lower case atau huruf kecil
    //2. disimpan langsung di dalam memori
    //

    // 1. NUMERIC
    // 1.1 INTEGRAL

    // 1.1.1 FLOAT
    float iniFloat = 3.14f; // menyimpan nilai sebesar 32 bit

    //    1.1.2 DOUBLE
    double iniDouble = 3.9D; // menyimpan nilai sebesar 64 bit

    // 1.1.3 BYTE
    // range angka yang disimpan byte -128 s/d 127
    byte iniByte = 25; // menyimpan 8 bit, digunakan untuk menyimpan bilangan bulat

    // 1.1.4. SHORT
    // range angka yg disimpan -32.000 - 32.000
    short iniShort = 35;

    // 1.1.5 INTEGER
    // range angka yang disimpan -2,147,000,000 s/d 2,147,000,000
    int iniInt = 2500;

    // 1.1.6 LONG
    long iniLong = 1857L;

    // 1.2
//    menyimpan nilai sebesar 16 bit
    //berupa unicode character
    char iniChar = 'A';

    // 1.3 BOOLEAN
    // TRUE atau FALSE
    boolean iniBoolean = true;

    /**
     * TIPE DATA BUKAN PRIIMITIF
     *
     * Diawali dengan uppercase
     * bisa bernilai NULL
     * tidak langsung disimpan di dalam memori
     *
     * **/

    Float iniFloat1 = 3.4f;
    Double iniDouble1 = 3.9D;
    Byte iniByte1 = 25;
    Short iniShort1 = 35;
    Integer iniInt1 = 2500;
    Long iniLong1 = 1857L;
    Character iniChar1 = 'A';
    Boolean iniBoolean1 = true;
    String iniString1 = "Java Spring Boot";
    String iniStringNull = null; // lebih baik diisi daripada harus null, karena menghindari error
}
