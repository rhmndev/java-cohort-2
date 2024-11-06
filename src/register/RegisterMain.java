package register;

public class RegisterMain {

    // varible NAME nilainya tidak bisa berubah-rubah, karena ada keyword FINAL yang artinya nilainya KONSTAN/TETAP
    // ketika membuat variable yg KONSTANT/TETAP (final), nama variablenya harus UPPERCASE (Huruf Besar semua)
    public static final String DEFAULT_NAME = "YOUR NAME"; // Nilainya KONSTANTA/TETAP

    int variable = 12; // Variable Global/INSTANCE VARIABLE
    static int variable1 = 5;

    RegisterMain registerMain = new RegisterMain();


    public static void main(String[] args) {
        // ini disebut VARIABLE LOCAL hanya bisa diakses d dalam method main.
          int number = 100;

          variable1 = 1;
        System.out.println(DEFAULT_NAME);
//        RegisterForm form = new RegisterForm();
//        form.setFullName("Rahman Nurhadi");
//
//        String fullName = form.getFullName();
//        System.out.println("Full Name : " + fullName);
//
//        int phoneNumber = form.getPhoneNumber();
//        System.out.println("Phone Number : " + phoneNumber);
//
//        Integer addressNumber = form.getAddressNumber();
//        System.out.println("Phone Number : " + addressNumber);

//        RegisterForm form = new RegisterForm();
//        form.setFullName("Nazwa Salsabila");
//        System.out.println("Full Name : " + form.getFullName());
//
//        form.setEmail("nazwa@gmail.com");
//        System.out.println("Email : " + form.getEmail());

            // ada 2 pilihan untuk memberkan nilai yaitu melalui SETTER dan PARAMETERIZED CONSTRUCTOR
//          RegisterForm registerForm = new RegisterForm();
            // Memberikan nilai melalui SETTER
//          registerForm.setFullName("Rahman Nurhadi");

            // Memberkan nilai melalui PARAMETERIZED CONSTRUCTOR
          RegisterForm formConstructor = new RegisterForm("Rahman Nurhadi", "rhmndev@gmail.com", "1234", 3453);

          String fullName = formConstructor.getFullName();
          String email = formConstructor.getEmail();

        System.out.println("FullName Constructor : " + fullName);
        System.out.println("Email Constructor : " + email);
    }

    public void test() {
            int number = 10;

    }

}
