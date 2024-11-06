package register;

public class RegisterForm {

    // FIELD atau PROPERTIES
    private String fullName;
    private int phoneNumber;
    private Integer addressNumber;
    private String email;
    private String password;

    //SOAL
    // Bagaimana caranya memberikan nilai pada properti password // Use SETTER
    // Bagaimana caranya mengambil nilai properti email // Use GETTER

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

//    //GETTER
    public String getFullName() {
        return this.fullName;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public Integer getAddressNumber() {
        return this.addressNumber;
    }

    //SETTER
    public void setFullName(String input) {
        this.fullName = input;
    }

    public void setPhoneNumber(int input) {
        this.phoneNumber = input;
    }

    // DEFALT CONSTRUCTOR
    public RegisterForm() {}

    // PARAMETERIZED CONSTRUCTOR MIRIP DENGAN SETTER TETAPI TIDAK PUNYA VOID
    public RegisterForm(String input1) {
        this.fullName = input1;
    }
    //  Konsep Overload Constructor
    public RegisterForm(String input1, String input2, String input3, int input4) {
        this.fullName = input1;
        this.email = input2;
        this.password = input3;
        this.phoneNumber = input4;
    }

}
