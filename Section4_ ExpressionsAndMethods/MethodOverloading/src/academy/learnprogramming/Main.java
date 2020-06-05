package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateScore("Tim",500);
        System.out.println(newScore);

        int anotherScore=calculateScore(700);
        System.out.println(anotherScore);

    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player "+playerName+"score "+score);
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("score "+score);
        return score*1000;
    }
    public static void calculateScore(){
        System.out.println("not overloading just cause return type is diff");
    }
}
