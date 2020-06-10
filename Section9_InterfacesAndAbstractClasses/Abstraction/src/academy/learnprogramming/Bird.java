package academy.learnprogramming;

public abstract class Bird extends Animal implements canFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out");
    }
//    public abstract void fly(); not needed now if u are implementing the interface canFly

    //implementing the interface method below
    @Override
    public void fly() {
        System.out.println(getName()+" its flapping its wings");
    }
}
