/**
 * Created by owensullivan on 4/15/16.
 */
public class Person {
    public double arrivalTime;
    public double boardTime;
    public Stop dest;

    public Person(double arrivalTime){this.arrivalTime=arrivalTime;}

    public double getArrivalTime(){return arrivalTime;}
    public double getBoardTime(){return boardTime;}
    public int getDestNumber(){return dest.getStopNumber();}
}
