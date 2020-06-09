package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String>placesToVisit =new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//        placesToVisit.add(1,"Alice Springs");    //Alice Springs inserted rest are moved up
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Darwin");
        addInOrder(placesToVisit,"Adelaide");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Perth");
        visit(placesToVisit);

    }
    private static void printList(LinkedList<String>linkedList){
        Iterator<String>i=linkedList.iterator();   //Iterator to the linked list
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());   //display i and then i=i.next()
        }
        System.out.println("============================");
    }
    private static boolean addInOrder(LinkedList<String>linkedList,String newCity){
        ListIterator<String>stringListIterator=linkedList.listIterator(); //doesnt point to first element after declaration
        while(stringListIterator.hasNext()){
            int comparison=stringListIterator.next().compareTo(newCity); //after .next() now it points to first element
            if(comparison==0){
                System.out.println(newCity+" is already included as a destination");
                return false;
            }else if (comparison>0){
                stringListIterator.previous(); //.previous to come back cause we moved past using .next
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;   //this variable takes care of the issue with list iterator while traversing
        ListIterator<String>listIterator=cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacations over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){  //to check if you just pressed previous and then u r going to next location
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){ //to check if u just pressed next and are then u r going back
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }
}
