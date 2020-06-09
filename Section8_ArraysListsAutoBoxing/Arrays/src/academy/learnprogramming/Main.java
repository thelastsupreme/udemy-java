package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
//        int[]myIntArray=new int[10];
//       int[]myIntArray={1,2,3,4,5,6,7,8,9,10};
//        for (int i=0;i<10;i++){
//            myIntArray[i]=i*10;
//        }
//        for(int i : myIntArray){           //Enhanced for loop
//            System.out.println(myIntArray[i]);
//        }
//        printArray(myIntArray);            //function call
//        myIntArray[5]=50;
//        double[]myDoubleArray=new double[10];
//        System.out.println(myIntArray[5]);
        int[] myIntegers=getIntegers(5);

        for (int i=0;i<myIntegers.length;i++){
            System.out.println(myIntegers[i]);
        }
        double avg=getAvg(myIntegers);
        System.out.println(avg);
    }
    public static void printArray(int[]array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\n");
        int[] values=new int[number];

        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAvg(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/(double)array.length;
    }
}
