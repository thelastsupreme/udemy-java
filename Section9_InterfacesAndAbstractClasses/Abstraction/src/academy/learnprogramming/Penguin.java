package academy.learnprogramming;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();  //can implement it
        System.out.println("not good at swimming");
    }
}
