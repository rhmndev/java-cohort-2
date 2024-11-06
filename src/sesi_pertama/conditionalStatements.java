package sesi_pertama;

public class conditionalStatements {

    // ini adalah method/function untuk mengetikkan kode di sini
    public static void main(String[] args) {
        // IF .. ELSE CONDITION
        int nominal = 10000; // kita punya varible

//        if (nominal == 8000) { //KONDISI 1
//            System.out.println("Beli Snack A"); // KEPUTUSAN 1
//        } else if (nominal <= 12000) { // KONDISI 2
//            System.out.println("Beli Snack B"); // KEPUTUSAN 2
//        } else {
//            System.out.println("Tidak Usah Jajan"); // DI SWITCH, Secara tidak langsung ini adalah keputusan DEFAULT
//        }

        // SWITCH CONDITION
        switch (nominal) {
            case 8000:
                System.out.println("Beli Snack A");
                break; // agar program terhenti jika kondisi terpenuhi.
            case 12000:
                System.out.println("Beli Snack B");
                break;
            default:
                System.out.println("Tidak usah jajan");
                break;
        }

/////////////////////////////////////////////
        // TERNARY CONDITION
        // ? : -> bagian dari ternary operator
        // hanya bisa 1 kondisi/condition

        int number = 10;
        String result = ""; // Empty String ""

        // KONDISI IF.. ELSE
        if (number == 9) {
            result = "Kertas";
        } else {
            result = "Dadu";
        }

        String output = number == 9 ? "Kertas" : "Dadu";
        // Rumus TERNARY OPERATOR
        // TIPE-DATA-OUTPUT NAMA-VARIABLE = KONDISI ? KEPUTUSAN 1 : KEPUTUSAN 2

    }
}
