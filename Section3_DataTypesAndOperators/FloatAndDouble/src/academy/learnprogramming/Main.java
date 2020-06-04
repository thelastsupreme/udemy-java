package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float Maximum value = "+myMaxFloatValue);

        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double Maximum value = "+myMaxDoubleValue);

        //note : double is default floating type in java
        //float a=5.25; //error
        float a =(float)5.25;
        //or
        float b=6.27f;
        System.out.println(a);
        System.out.println(b);
        
    }
}
