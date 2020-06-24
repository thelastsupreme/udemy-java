package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre=new Theatre("Olympian",8,12);
        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);  //shallow copy
//        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else{
            System.out.println("Seat already reserved");  //seat already reserved is printed since its a shallow copy
        }

        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);  randomize elements in the list
        printList(seatCopy); //printed in reverse order
        printList(theatre.seats);//printed in same order as they both reference they same objects but they are two different array lists
        Theatre.Seat minSeat=Collections.min(seatCopy);
        Theatre.Seat maxSeat=Collections.max(seatCopy);
        System.out.println("Min seat Number is "+ minSeat.getSeatNumber());

        //below code snippet results in error because we are just giving a capacity but for sort to work we have to create same number of objects
//        List<Theatre.Seat>newList= new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList,theatre.seats);//destination and source
    }

    public static void printList(List<Theatre.Seat>list){
        for (Theatre.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================================");
    }
}
