/**
 * Created by owensullivan on 4/15/16.
 */
public class TrainEvent implements Event{
    public Train train;
    public Stop stop;

    TrainEvent(Train t, Stop s){
        train = t;
        stop = s;
    }

    public void run(){
        int unloadtime = train.unload(stop);
        int loadtime = train.load(stop);
        Stats.addToTrainCapacity(train);
        if (stop.getStopNumber()==1 && train.direction=='W'){
            train.direction='E';
            loadtime+=train.load(stop);
        }
        if (stop.getStopNumber()==23 && train.direction=='E'){
            train.direction='W';
            loadtime+=train.load(stop);
        }
        TrainEvent next;
        if (train.direction=='W') {
            next = new TrainEvent(train, stop.getWest());
        }
        else{
            next = new TrainEvent(train, stop.getEast());
        }
        int totaltime=15;
        if (unloadtime+loadtime>15){totaltime=unloadtime+loadtime;}
        TrainSim.agenda.add(next,180+totaltime);
    }
}
