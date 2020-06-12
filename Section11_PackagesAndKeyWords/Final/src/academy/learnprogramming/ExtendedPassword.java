package academy.learnprogramming;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }
        //cannot override final methods
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as "+this.decryptedPassword);
//    }
}
