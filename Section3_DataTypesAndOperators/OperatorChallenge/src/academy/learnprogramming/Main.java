package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double myDouble=20.00;
        double secondDouble=80.00;

        double addAndMultiply=(myDouble+secondDouble)*100;
        System.out.println(addAndMultiply);
        double remainder = addAndMultiply %40.00;
        System.out.println("remainder = "+remainder);
        boolean boolVar =(remainder==0);
        System.out.println(boolVar);
        if(!boolVar)
            System.out.println("got some remainder");
    }
}
