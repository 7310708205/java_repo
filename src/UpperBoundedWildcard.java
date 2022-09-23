import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {
    public static double sum(List<? extends Number> numlist) {
        double sum = 0.0;
        for (Number n : numlist) sum += n.doubleValue();
        return sum;
    }

    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(2, 3, 5);
        System.out.println(sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 3.5, 4.5);
        System.out.println(sum(doubleList));
    }
}


