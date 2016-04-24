/**
 * Created by owensullivan on 4/16/16.
 */
public class Train {
    public int capacity;
    public int passengerct;
    public Stack passengerlist;
    public char direction;

    public Train(int NumberOfCars) {
        passengerct = 0;
        capacity = 50 * NumberOfCars;
        //direction = Direction;
    }

    public void addInOrderW(Person p) {
        //furthest east is top of the stack.
        // Used for westbound train.
        if (passengerlist.isEmpty()){
            passengerlist.push(p);
        }
        else {
            N cur = passengerlist.start;
            Person curperson = (Person) cur.getData();
            if (curperson.getDestNumber() <= p.getDestNumber()) {
                passengerlist.push(p);
            } else {
                while (curperson.getDestNumber() > p.getDestNumber() && cur.getNext() != null) {
                    cur = cur.getNext();
                    curperson = (Person) cur.getData();
                }
                if (cur.getNext() == null) {
                    cur.setNext(new N(p, null));
                } else {
                    cur.setNext(new N(p, cur.getNext()));
                }
            }
        }
    }

    public void addInOrderE(Person p){
        //furthest west is top of stack
        //Used for eastbound train.
        if (passengerlist.isEmpty()){
            passengerlist.push(p);
        }
        else {
            N cur = passengerlist.start;
            Person curperson = (Person) cur.getData();
            if (curperson.getDestNumber() >= p.getDestNumber()) {
                passengerlist.push(p);
            } else {
                while (curperson.getDestNumber() < p.getDestNumber() && cur.getNext() != null) {
                    cur = cur.getNext();
                    curperson = (Person) cur.getData();
                }
                if (cur.getNext() == null) {
                    cur.setNext(new N(p, null));
                } else {
                    cur.setNext(new N(p, cur.getNext()));
                }
            }
        }
    }

    public int load(Stop s){
        //used to load a train
        //returns time taken to load train
        int time = 0;
        if (direction=='E') {
            while (passengerct < capacity && s.qe.length() > 0) {
                addInOrderE((Person) s.qe.remove());
                time+=1;
            }
        }
        else{
            while (passengerct < capacity && s.qw.length() > 0){
                addInOrderW((Person)s.qw.remove());
                time+=1;
            }
        }
        return time;
    }

    public int unload(Stop s){
        //returns time taken to unload train
        int time = 0;
        int stopnum = s.getStopNumber();
        while (((Person)(passengerlist.top())).getDestNumber()==s.getStopNumber()){
            Person exitingpass = (Person) passengerlist.pop();
            time+=2;
            Stats.addToWaitTime(exitingpass);
            Stats.addToTravelTime(exitingpass);
        }
        return time;
    }

    public void setDirection(char Direction){direction=Direction;}
    public char getDirection(){return direction;}
}
