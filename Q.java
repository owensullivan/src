/**
 * Created by owensullivan on 4/15/16.
 */
//taken from Q1 in week 8 code

public class Q{

    // constructor

    public Q() {}

    // selectors

    public void add(Object o) {

        if (size == 0) {
            front = new N(o, null);
            rear = front;
        }
        else {
            rear.setNext(new N(o, null));
            rear = rear.getNext();
        }
        size++;
    }

    public Object remove() {

        Object answer;

        if (size == 0)
            return null;

        answer = front.getData();
        front = front.getNext();
        size--;
        if (size == 0)
            rear = null;
        return answer;
    }

    public int length() {
        return size;
    }

    private int size;
    private N front;
    private N rear;

}  // Q1 class
