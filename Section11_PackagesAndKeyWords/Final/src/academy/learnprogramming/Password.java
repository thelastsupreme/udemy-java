package academy.learnprogramming;

public class Password {
    private static final int key=23687721;
    private final int encrptedPassword;

    public Password(int encrptedPassword) {
        this.encrptedPassword = encyptDecrypt(encrptedPassword);
    }

    private int encyptDecrypt(int password){
        return password^key;
    }
    public final void storePassword(){
        System.out.println("Saving password as "+this.encrptedPassword);
    }
    public boolean letMeIn(int password){
        if (encyptDecrypt(password)==this.encrptedPassword){
            System.out.println("Welcome!");
            return true;
        }else {
            System.out.println("Wrong password, you cant come in");
            return false;
        }
    }
}
