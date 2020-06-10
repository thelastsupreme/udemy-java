package academy.learnprogramming;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        //this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
        }
    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if (phoneNUmber==myNumber){
            isRinging=true;
            System.out.println("Ring Ring");
        }else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
