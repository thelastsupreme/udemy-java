package academy.learnprogramming;

import java.util.*;


public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myIntegers=getIntegers(5);
	    int[] mysortedIntegers=sortIntegers(myIntegers);
        for (int i=0;i<mysortedIntegers.length;i++){
            System.out.println(mysortedIntegers[i]);
        }

    }
    public static int[] getIntegers(int capacity){
        int[]array=new int[capacity];
        System.out.println("Enter "+capacity+" values\n");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i]=array[i];
        }
        for (int i=0;i<sortedArray.length-1;i++){
            int max=i;
            for(int j=i+1;j<sortedArray.length-1;j++){
                if(sortedArray[j]>sortedArray[max]){
                    max=j;
                }
            }
            if(max!=i){
                int temp=sortedArray[i];
                sortedArray[i]=sortedArray[max];
                sortedArray[max]=temp;
            }
        }
        return sortedArray;
    }
}
