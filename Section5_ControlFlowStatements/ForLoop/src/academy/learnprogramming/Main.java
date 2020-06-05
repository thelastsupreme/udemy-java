package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //for(init;termination;increment)
        for(int i=0;i<5;i++){
            System.out.println("loop "+i+" hello");
        }
        for(int i=2;i<9;i++){
            System.out.println("10000 at "+i+" interest rate = "+String.format("%.2f",calculateInterest(10000.0,i))); //just using format to set precision
        }
        int count=0;
        for(int i=10;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("number "+i+" is a prime number");
                if(count==3) {
                    System.out.println("Exit");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static double calculateInterest(double amount,double interestRate){
        return(amount*(interestRate/100));
    }
}
