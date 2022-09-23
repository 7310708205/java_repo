import java.util.List;
import java.util.ArrayList;

public class LowerBoundWildcard {
    static void printListItems1(List<Integer> list){
        for (Integer num : list){
            System.out.println(num);
        }
    }

    static void printListItems2(List<? super Integer> list){
        for (Object num : list){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Number> list2 = new ArrayList<Number>();
        list2.add(1.4);
        list2.add(2.3);
        list2.add(3.4);

        printListItems1(list1);

        printListItems2(list1);

        printListItems2(list2);
    }
}
