package academy.learnprogramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer>squares=new HashSet<>();
        Set<Integer>cubes=new HashSet<>();

        for(int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes");

        Set<Integer>union=new HashSet<>(squares);
        union.addAll(cubes); //for union use add all
        System.out.println("Union contains "+union.size()+" elements");

        Set<Integer>intersection=new HashSet<>(squares);
        intersection.retainAll(cubes); //for intersection use retain all
        System.out.println("Intersection contains "+intersection.size()+" elements");

        Set<String>words=new HashSet<>();
        String sentence="one day in the year of the fox";
        String[] arrayWords=sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords)); //.addAll takes in a collection so converting array to array list

        for (String s: words){
            System.out.println(s);
        }
        //use .removeAll for asymmetric difference
        //do union-intersection for symmetric difference
        //use .containsAll for subset check.
    }
}
