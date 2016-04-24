/**
 * Created by owensullivan on 4/15/16.
 */
//taken from NodeClass in week 5 code

public class N {

    // constructors

    public N() {}

    public N(Object o, N link) {
        data = o;
        next = link;
    }

    // selectors

    public Object getData() {
        return data;
    }

    public void setData(Object o) {
        data = o;
    }

    public N getNext() {
        return next;
    }

    public void setNext(N link) {
        next = link;
    }

    // instance variables

    private Object data;
    private N next;

}  // NodeClass class