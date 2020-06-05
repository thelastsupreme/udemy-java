package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver=true;
	    int score=5000;
	    int levelCompleted=5;
	    int bonus=100;

//	    if(score==4000)
//            System.out.println("no code block for one line");
//		System.out.println("This executes no matter what");
//
//		if(score<6000){
//			System.out.println("If executes");
//		}
//		else if(score>1000){
//			System.out.println("else if executes");
//		}
//		else {
//			System.out.println("else executes");
//		}

		if(gameOver){
			int finalScore=score+(levelCompleted*bonus);
			System.out.println("Your final score was "+finalScore);
		}
//		int x=finalScore; cant access finalScore cause not in scope
    }
}
