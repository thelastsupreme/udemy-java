package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //below 8 are the primitive types
	    //byte
        //short
        //int
        //float
        //long
        //double
        //char
        //boolean

        //String is not a primitive type
        String myString="This is a string";
        System.out.println(myString);
        myString+=" adding another";
        System.out.println(myString);
        myString+= " \u00A9 2020"; //unicode for copyright character
        System.out.println(myString);


        String numberString="250.55";
        numberString+="20.333";
        System.out.println(numberString);

        String lastString="10";
        int myInt=50;
        lastString+=50;
        System.out.println(lastString); //50 appends to 10 tho 50 is an int

    }
}
