package academy.learnprogramming;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear>gears;
    private int maxGears;
    private int currGear =0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears=new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
//        calling addGear function in the constructor
        for (int i = 0; i <maxGears ; i++) {
            addGear(i,i*5.3);
        }
    }
    public void operateClutch(boolean in){
        this.clutchIsIn=in;
    }
    public void addGear(int number,double ratio){
        if((number>0)&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public void changeGear(int newGear){
        if (newGear>=0&& newGear<this.gears.size()&&this.clutchIsIn){
            this.currGear=newGear;
            System.out.println("Gear "+newGear+" selected");
        }else {
            System.out.println("Grind!!");
            this.currGear=0;
        }
    }
    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs*gears.get(currGear).getRatio();
    }
    //made it private for complete encapsulation
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;   //this here refers to Gear class obj
            this.ratio = ratio;             //if u wanna refer to outer class then use GearBox.this.
        }
        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
        public double getRatio(){
            return ratio;
        }
    }
}
