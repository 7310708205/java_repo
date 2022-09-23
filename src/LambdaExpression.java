interface Add {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        Add ad = (int a, int b) -> (a+b);
        System.out.println(ad.add(10, 15));

    }
}
