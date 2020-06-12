package academy.learnprogramming;

public class Main {
    //NOTE:static methods cant invoke non static methods in its own class
    public static void main(String[] args) {
	    StaticTest firstInstance=new StaticTest("1st Instance");
        System.out.println(firstInstance.getName()+" is instance number "+StaticTest.getNumInstance()); //if function is static u can directly use classname.fnx() as fxn call

        StaticTest secondInstance=new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumInstance());
    }
}
