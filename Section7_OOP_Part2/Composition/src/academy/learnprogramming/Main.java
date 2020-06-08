package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("220B","Dell","240",dimensions);

        //instead of making a new variable u can just pass the instance to the function this way

        Monitor theMonitor=new Monitor("27inch",27,"Acer",new Resolution(2540,1440));
        MotherBoard motherBoard=new MotherBoard("23-D","Asus",4,6,"w2.44");

        PC thePC =new PC(theCase,theMonitor,motherBoard);

        //use this way if u have public get functions
//        thePC.getMonitor().drawPixelAt(1500,1200,"Red");  //composition calling using a public getter
//        thePC.getMotherBoard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();  //this way the object is being hidden
    }
}
