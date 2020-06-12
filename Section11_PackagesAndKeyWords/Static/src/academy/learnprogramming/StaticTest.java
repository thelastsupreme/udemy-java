package academy.learnprogramming;

public class StaticTest {
//    private int numInstance;  doesnt matter how many times u increment in constructor numInstance will always be one this way
    private static int numInstance;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstance++;
    }

//    public int getNumInstance() {
//        return numInstance;
//    }
    //make the function static so that u dont need an object specifically to call this function
    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}
