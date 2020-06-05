package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count=0;
	    while (count!=5){
            System.out.println("Count value is "+count);
            count++;
        }

	    count=1;
	    do{
            System.out.println("count value was " +count);
            count++;
        }while (count!=6);
    }
}
