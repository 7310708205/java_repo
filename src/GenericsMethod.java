public class GenericsMethod {
    public static < t > void printArray(t[] ele) {
        for ( t element : ele){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        System.out.println("Integer array is :");
        printArray(array);
    }
}
