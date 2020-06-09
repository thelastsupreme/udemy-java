package academy.learnprogramming;

import java.util.ArrayList;
//  Wrapper class
//class IntClass{
//    private int myValue;
//
//    public IntClass(int myValue) {
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}
public class Main {

    public static void main(String[] args) {
	    String[] strArray=new String[10];
	    int[] intArray= new int[10];

        ArrayList<String>strArrayList=new ArrayList<String>();
        strArrayList.add("Tim");
//        ArrayList<int>intArrayList=new ArrayList<int>(); //primitive types cant be used
//        ArrayList<IntClass>intClassArrayList= new ArrayList<IntClass>();
//        intClassArrayList.add(new IntClass(44));
//        Integer integer=new Integer(65);
//        Double doubleValue =new Double(12.25);
//        ArrayList<Integer>intArrayList =new ArrayList<Integer>();
//        for (int i=0;i<=10;i++){
//            intArrayList.add(Integer.valueOf(i));            //Boxing
//        }
//        for (int i=0;i<=10;i++){
//            System.out.println(i+" --> "+intArrayList.get(i).intValue()); //UnBoxing
        //Java does this for u automatically
        Integer integer= 65;
        ArrayList<Integer>intArrayList =new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            intArrayList.add(i);            //Boxing
        }
        for (int i=0;i<=10;i++){
            System.out.println(i+" --> "+ intArrayList.get(i)); //UnBoxing

        }
    }
}
