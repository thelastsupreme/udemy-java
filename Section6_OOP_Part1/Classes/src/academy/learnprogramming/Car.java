package academy.learnprogramming;

//public: unrestricted access to the class

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void  setModel(String model){
        String valModel=model.toLowerCase();
        if (valModel.equals("carrera")||valModel.equals("comodore")) {
            this.model = model;
        }else {
            this.model="Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }

}
