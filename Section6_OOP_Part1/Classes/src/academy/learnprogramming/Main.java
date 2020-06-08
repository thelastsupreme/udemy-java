package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche=new Car();
        Car holden =new Car();

        System.out.println(porsche.getModel()); //null is printed
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
        
        porsche.setModel("xxx");
        System.out.println(porsche.getModel());
    }
}
