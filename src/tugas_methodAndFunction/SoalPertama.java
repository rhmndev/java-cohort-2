package tugas_methodAndFunction;

public class SoalPertama {
    private static final String NAME = "RAHMAN NURHADI";

    public static void main(String[] args) {
        String myName = printMyName(null);
        System.out.println("Output : " + myName );
    }

    private static String printMyName(String name) {
        if (name == null ||name.isEmpty() || name.isBlank()) {
            return NAME;
        } else {
            return name;
        }
    }
}
