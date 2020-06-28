package academy.learnprogramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x=10;
//        int y=0;
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divideLBYL(x,y));
        int x=getIntEAFP();
        System.out.println("x is "+x);
    }

    private static int getInt(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int getIntLBYL(){
        Scanner s=new Scanner(System.in);
        boolean isValid=true;
        System.out.println("Please enter an integer");
        String input=s.next();
        for (int i = 0; i <input.length() ; i++) {
            if (!Character.isDigit(input.charAt(i))){
                isValid=false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        }
        catch (InputMismatchException e){
            return 0;
        }
    }
    private static int divideLBYL(int x,int y){ //look before you leap
        if(y!=0){
            return x/y;
        }else {
            return 0;
        }
    }

    private static int divideEAFP(int x,int y){ //easy to ask for forgiveness than permission
        try {
            return x/y;
        }
        catch (ArithmeticException e){
            return 0;
        }
    }
}
