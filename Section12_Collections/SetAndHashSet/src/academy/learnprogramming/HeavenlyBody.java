package academy.learnprogramming;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final  String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody>satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override     //this notation is important cause it makes sure we are overriding and not overloading
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        System.out.println("obj.getClass() is "+obj.getClass());
        System.out.println("this.getClass() is "+this.getClass());
        if((obj==null)||(obj.getClass()!=this.getClass())){
            return false;
        }
        String objName=((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override      //we are overriding hashcode cause we have to make sure the objects fall in the same bucket to check for duplicates
    public int hashCode() {
        System.out.println("hash code called");
        return this.name.hashCode()+57; //just a random number

    }
}
