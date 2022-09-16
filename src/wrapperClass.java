class Wrapper{
    private int iter;

    Wrapper(int i){
        this.iter = i;
    }

    public int getValue() {
        return iter;
    }

    public void setValue(int i) {
        this.iter = i;
    }

    public String toString() {
        return Integer.toString(iter);
    }
}
public class wrapperClass {
    public static void main(String[] args) {
        Wrapper w = new Wrapper(30);
        w.setValue(50);
        System.out.println(w.getValue());
        System.out.println(w);
    }
}