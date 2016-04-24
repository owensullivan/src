/**
 * Created by owensullivan on 4/24/16.
 */
public class Stats {
    //average wait time
    public static double waitTime = 0;
    public static double passengersThroughSystem = 0;
    //average travel time
    public static double travelTime = 0;
    //average train capacity
    public static double percentFullness=0;
    public static double totalTrainsStopped=0;

    public static void addToWaitTime(Person p){
        waitTime += (TrainSim.agenda.getCurrentTime()-p.arrivalTime);
        passengersThroughSystem++;
    }

    public static void addToTravelTime(Person p){
        travelTime += (TrainSim.agenda.getCurrentTime()-p.boardTime);
    }

    public static void addToTrainCapacity(Train t){
        percentFullness += (t.passengerct/t.capacity);
        totalTrainsStopped++;
    }

    public static void print(){
        System.out.println("Stats from the simulation...\n");
        System.out.println("    Average Wait Time: "+(waitTime/passengersThroughSystem)+"\n");
        System.out.println("    Average Travel Time: "+(travelTime/passengersThroughSystem)+"\n");
        System.out.println("    Average Train Fullness: "+(percentFullness/totalTrainsStopped));
    }
}
