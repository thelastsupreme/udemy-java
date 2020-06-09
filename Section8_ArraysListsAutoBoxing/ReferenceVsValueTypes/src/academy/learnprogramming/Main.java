package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue=10;
	    int anotherIntValue=myIntValue;
        System.out.println("myIntValue "+myIntValue);
        System.out.println("anotherIntValue "+anotherIntValue);
        anotherIntValue++;
        System.out.println("myIntValue "+myIntValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        int[] myIntArray=new int[5];
        int[] anotherArray=myIntArray;
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));  //every element in array converted to string and prints it out
        System.out.println("myAnotherArray "+Arrays.toString(anotherArray));
        myIntArray[0]=1;
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("myAnotherArray "+Arrays.toString(anotherArray));
        modifyArray(myIntArray);
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("myAnotherArray "+Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[0]=2;
        array=new int[]{1,2,3,4,5};
        System.out.println("array "+Arrays.toString(array));
    }
}
