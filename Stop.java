/**
 * Created by owensullivan on 4/15/16.
 */
public class Stop {
    private Stop west;
    private Stop east;
    public Q qw;
    public Q qe;
    private int stopnumber;

    public Stop getWest(){return west;}
    public Stop getEast(){return east;}
    public int getStopNumber(){return stopnumber;}
    //public String getName(){return name;}

    //public void setName(String name){this.name = name;}
    public void setWest(Stop stop){west=stop;}
    public void setEast(Stop stop){east=stop;}
    public void setStopNumber(int StopNumber){stopnumber=StopNumber;}

    public void addToEast(Person p){qe.add(p);}
    public void addToWest(Person p){qw.add(p);}
    public Person removefromEast(){return (Person)(qe.remove());}
    public Person removefromWest(){return (Person)(qw.remove());}

    public boolean isEast(Stop s){
        if (s.getStopNumber()>stopnumber){return true;}
        else {return false;}
    }
    public boolean isWest(Stop s){
        if (s.getStopNumber()<stopnumber){return true;}
        else {return false;}
    }

    public Stop(Stop west, Stop east, int StopNumber){
        //this.name = name;
        this.east = east;
        this.west = west;
        qw = new Q();
        qe = new Q();
        stopnumber=StopNumber;
    }
}
