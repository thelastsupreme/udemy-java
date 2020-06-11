package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items=new ArrayList<>();   //use the parameterized type to make sure things work for a data type
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");  works fine when building but fails during run time
        items.add(4);
        items.add(5);

        printDoubled(items);
    }
    private static void printDoubled(ArrayList<Integer> n){
        //before using parameterized ArrayList
//        for (Object i:n) {
//            System.out.println((Integer)i*2);
//        }
        //after
        for (int i:n){
            System.out.println(i*2);
        }
    }
}
