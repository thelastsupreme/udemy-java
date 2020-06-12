package academy.learnprogramming;

public class SomeClass {
    private static int classCounter=0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name=name;
        classCounter++;
        instanceNumber=classCounter;  //assign it once and doesn't change
        System.out.println(name+" created, instance is"+instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
