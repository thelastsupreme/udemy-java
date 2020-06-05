package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter BirthYear");
        boolean hasNextInt=scanner.hasNextInt();  //checks if the element in scanner is an int or not, it wont make any changes to the scanner
        if (hasNextInt){
            int year=scanner.nextInt();

            scanner.nextLine();   //handles next line character after u have read a number

            System.out.println("Enter your name");
            String name=scanner.nextLine();

            System.out.println("Name is "+name);
            int age=2020-year;
            if (age>=0&&age<=100)
                System.out.println("you are "+age+" years old");
            else
                System.out.println("Invalid year of birth");

            scanner.close();
        }
        else
            System.out.println("did not enter an int for year");

    }
}
