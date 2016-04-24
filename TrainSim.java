/**
 * Created by owensullivan on 4/15/16.
 */
public class TrainSim {
    public int AmountOfTrains = 1;
    public int CarsPerTrain = 1;
    public double interArrivalRate = 30;
    public static StopList stoplist = new StopList();
    public static PQ agenda = new PQ();
    public static Train[] trains;

    public TrainSim() {
        trains = new Train[AmountOfTrains];
        int i = 0;
        while (i<trains.length){
            trains[i]=new Train(CarsPerTrain);
            i++;
        }
        i = 0;
        while (i<AmountOfTrains){
            TrainEvent t;
            int stopnum = i*(46/AmountOfTrains);
            if (stopnum/23 >=1){
                trains[i].setDirection('W');
                stopnum = stopnum-23;
                t = new TrainEvent(trains[i],stoplist.setFromStopNumber(24-stopnum));
                agenda.add(t, 0);
            }
            else{
                trains[i].setDirection('E');
                t = new TrainEvent(trains[i],stoplist.setFromStopNumber(stopnum));
                agenda.add(t, 0);
            }
        }
    }
}
