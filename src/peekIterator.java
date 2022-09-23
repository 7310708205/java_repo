import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {

        iter = iterator;
        if(hasNext()) next = iter.next();
    }

    public Integer peek() {
        return next;
    }
    @Override
    public Integer next() {
        Integer curVal = next;
        if(iter.hasNext())
            next = iter.next();
        else
            next = null;
        return curVal;
    }

    @Override
    public boolean hasNext() {
        return (next != null) || iter.hasNext();
    }
}

public class peekIterator {
    public static void main(String[] args) {
        PeekingIterator peekingIterator= new PeekingIterator([1,2,3]);

        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println( peekingIterator.hasNext());
    }

}
