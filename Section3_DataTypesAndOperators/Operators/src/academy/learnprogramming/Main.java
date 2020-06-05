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

        int topScore=80;
        if(topScore==100){
            System.out.println("dfisjhf");
        }
        int secondTopScore=60;
        if ((topScore>secondTopScore) && (topScore<100)){
            System.out.println("logical and operator");
        }

        if ((topScore>secondTopScore) || (topScore<100)){
            System.out.println("logical or operator");
        }

        boolean isCar=false;
        if(isCar=true){  //though == should be used an error wont be raised cause it is just taking isCar value which is a boolean
            System.out.println("this is not supposed to happen");
        }

        //ternary operator
        boolean wasCar=isCar ? true:false;  //condition ? true_value:false_value
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
