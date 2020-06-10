package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;  //cant assign using new ITelephone or use initialize as DeskPhone object
        timsPhone=new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone=new MobilePhone(23456); //can assign cause initialized with interface
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
