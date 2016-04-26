/**
 * Created by owensullivan on 4/17/16.
 */

//adapted from Stack1.java in week 8 code

public class Stack{

    // constructor

    public Stack() {}

    // selectors

    public void push(Object o) {
        start = new N(o, start);
    }

    public Object pop() {
        if (start == null)
            throw new RuntimeException("Tried to pop an empty stack");
        else {
            Object data = start.getData();
            start = start.getNext();
            return data;
        }
    }

    public Object top() {
        if (start == null)
            return null;
        else return start.getData();
    }

    public boolean isEmpty() {
        if (start == null)
            return true;
        else return false;
    }


    // instance variables

    public N start = null;

}  // Stack1 class
