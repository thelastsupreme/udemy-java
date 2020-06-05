package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int finalScore=calculateScore(true,800,5,100);
        System.out.println(finalScore);

    }
//    public static void calculateScore(){
//        boolean gameOver=true;
//        int score=800;
//        int levelCompleted=5;
//        int bonus=100;
//
//        if (gameOver){
//            int finalScore=score+(levelCompleted*bonus);
//            finalScore+=1000;
//            System.out.println("Final Score is "+finalScore);
//        }
//    }
//    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
//
//        if (gameOver){
//            int finalScore=score+(levelCompleted*bonus);
//            finalScore+=1000;
//            System.out.println("Final Score is "+finalScore);
//        }
//    }
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if (gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Final Score is "+finalScore);
            return finalScore;
        }
        return -1;
    }
}
