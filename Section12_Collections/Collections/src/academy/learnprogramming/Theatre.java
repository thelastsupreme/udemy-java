package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.*;

public class Theatre {
    private final String theatreName;
//    private List<Seat>seats=new ArrayList<>(); //make it LinkedList<> instead of ArrayList still works fine
    public List<Seat> seats=new ArrayList<>();     //made it public to access it directly from main for copying example
//    private Collection<Seat>seats=new TreeSet<>(); //cannot be used as TreeSet is one hierarchy below sorted set and it needs a comparable method
   static final Comparator<Seat>PRICE_ORDER=new Comparator<Seat>() {
    @Override
    public int compare(Seat seat1, Seat seat2) {
        //write a price function and use comparator accordingly
        return 0;
    }
}; //comparator always ends with a semi colon

    public Theatre(String theatreName,int numRows,int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow='A'+(numRows-1);
        for (char row='A';row<=lastRow;row++){
            for (int seatNum = 1; seatNum <=seatsPerRow ; seatNum++) {
                Seat seat=new Seat(row+String.format("%02d",seatNum));  //format to print with leading 0s if necessary
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }
    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat=new Seat(seatNumber);
        int found=Collections.binarySearch(seats,requestedSeat,null); //Collections class provides a binary search
        if (found>=0){
            return seats.get(found).reserve();
        }else {
            System.out.println("There is no Seat "+seatNumber);
            return false;
        }
        //modified the below code by using compareTo and built in binary search function

//        for (Seat seat: seats){
//            System.out.print(".");  //linear search counter
//            if (seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat=seat;
//                break;
//            }
//        }
//        if(requestedSeat==null){
//            System.out.println("There is no seat "+null);
//            return false;
//        }
//        return requestedSeat.reserve();
    }
    public void getSeats(){
        for (Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    //inner class seat
    //made it public to access Seat directly for copying list example
    public class Seat implements Comparable<Seat>{   //using comparable because collections provides a binary search and we need compare objects in binary search
        private final String seatNumber;
        private boolean reserved =false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override //overriding compareTo method provided by comparable interface
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }else {
                return false;
            }
        }
        public boolean cancel(){
            if (this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+seatNumber+" cancelled");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
