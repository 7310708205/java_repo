class multiplication {
    int multiply(int a, int b) {
        return a*b;
    }
    int multiply(int a, int b, int c) {
        return a*b*c;
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        multiplication m = new multiplication();
        System.out.println(m.multiply(20, 30));
        System.out.println(m.multiply(5, 10, 15));
    }
}
