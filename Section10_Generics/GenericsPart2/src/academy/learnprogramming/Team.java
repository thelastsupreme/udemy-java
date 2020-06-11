package academy.learnprogramming;

import java.util.ArrayList;


//GENERIC TEAM CLASS
public class Team<T extends Player>implements Comparable<Team<T>>{   //By using extends we make sure we cant pass any random class  //implement comparable to compare with other objects of same class
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;
    private ArrayList<T>members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if (members.contains(player)){
            //below line of code doesn't work as the compiler is not sure if the player of type T has a method getName but on using extends its fine since Player class has a getName method
            System.out.println(player.getName()+" is already on the team");
//            System.out.println(((Player)player).getName()+" is already on the team");  //quick fix is to cast it to player cause we know its gonna be a player
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName()+" picked for the team "+this.name);
//            System.out.println(((Player)player).getName()+" picked for the team "+this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent,int ourScore,int theirScore){
        String message;
        if (ourScore>theirScore){
            won++;
            message=" beat ";
        }else if (ourScore==theirScore){
            tied++;
            message=" drew with ";
        }else{
            message="lost to ";
            lost++;
        }
        played++;
        if (opponent!=null){  //updating opponents result
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return -1;
        }else if (this.ranking()<team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
//*********************  INITIAL TEAM CLASS *************************************
//public class Team {
//    private String name;
//    int played=0;
//    int won=0;
//    int lost=0;
//    int tied=0;
//    private ArrayList<Player>members=new ArrayList<>();
//
//    public Team(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public boolean addPlayer(Player player){
//        if (members.contains(player)){
//            System.out.println(player.getName()+" is already on the team");
//            return false;
//        }else {
//            members.add(player);
//            System.out.println(player.getName()+" picked for the team "+this.name);
//            return true;
//        }
//    }
//    public int numPlayers(){
//        return this.members.size();
//    }
//    public void matchResult(Team opponent,int ourScore,int theirScore){
//        if (ourScore>theirScore){
//            won++;
//        }else if (ourScore==theirScore){
//            tied++;
//        }else{
//            lost++;
//        }
//        played++;
//        if (opponent!=null){  //updating opponents result
//            opponent.matchResult(null,theirScore,ourScore);
//        }
//    }
//    public int ranking(){
//        return (won*2)+tied;
//    }
//}
