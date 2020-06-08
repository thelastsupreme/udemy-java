package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    Player player=new Player();
//	    player.name="Tim";
//	    player.health=20;
//      player.weapon="Sword";
//
//      int damage=10;
//      player.loseHealth(damage);
//      System.out.println("Remaining health : "+player.healthRemaining());


//        Problems in writing code this way
//        1.one can set the value of health from main class and make the player class loose control over the object
//        2.if the attribute name is changed in player for example name to fullName then it will result an error
//          in the main class as it is using the .name access type
//        3.we aren't guaranteeing that no invalid values can be passed i don't assign a value to health and use it

        
        EnhancedPlayer player=new EnhancedPlayer("Tim",50,"Sword");
        System.out.println("Initial health is "+player.getHealth());
    }
}
