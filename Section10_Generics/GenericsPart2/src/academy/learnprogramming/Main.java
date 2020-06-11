package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham=new SoccerPlayer("Beckham");
//        Team adelaideCrows=new Team("Adelaide Crows");

        //now adding type argument for the team
        Team<FootballPlayer> adelaideCrows=new Team<>("Adelaide Crows");
        //problem here is that the teams class is allowing us to add any kinda player so we are gonna make the Team class generic to handle this
        adelaideCrows.addPlayer(joe);
        Team<BaseballPlayer>baseballTeam=new Team<>("Chicago Cubs");
//        adelaideCrows.addPlayer(pat);  //error cause not of tpe football
//        adelaideCrows.addPlayer(beckham);//error
        baseballTeam.addPlayer(pat);

//        Team<String>brokenTeam=new Team<>("Broken team");
//        brokenTeam.addPlayer("no-one");  //gives an exception as we cant cast Sting to Player that we used in add method of Team class

        System.out.println(adelaideCrows.numPlayers());
    }
}
