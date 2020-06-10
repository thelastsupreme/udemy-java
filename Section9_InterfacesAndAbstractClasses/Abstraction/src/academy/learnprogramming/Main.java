package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dog dog=new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird=new Bird("pigeoto");   //If bird class is abstract then u cant create an object outta it
//        bird.breathe();
//        bird.eat();

        Parrot parrot=new Parrot("xxxx");
        parrot.fly();
        parrot.breathe();
        parrot.eat();

        Penguin penguin=new Penguin("Emperor");
        penguin.fly();
    }
}
