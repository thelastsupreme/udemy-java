package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2 ; //1+2=3
        System.out.println("1+2="+result);
        int prevResult=result;
        result-=1;
        System.out.println("previosus result ="+ prevResult);
        System.out.println(prevResult);
        System.out.println(result);
        result%=3;
        System.out.println(result);

        //Abbreviating operators
        result++;
        result--;

        boolean isAlien=false;
        if(!isAlien)
            System.out.println("It is not alien!!");

        int topScore=100;
        if(topScore==100)
        {
            System.out.println("dfisjhf");
        }
    }
}
