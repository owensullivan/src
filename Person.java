/**
 * Created by owensullivan on 4/15/16.
 */
public class Person {
    public double atime;
    public Stop dest;

    public Person(double arrivalTime){atime=arrivalTime;}

    public double getArrivalTime(){return atime;}
    public int getDestNumber(){return dest.getStopNumber();}
}
