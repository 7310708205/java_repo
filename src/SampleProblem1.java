import java.util.Scanner;

public class SampleProblem1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(num);
        if(num == 1) {
            System.out.println(0);
        }
        else{
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    System.out.println(num);
                } else if (num % 2 != 0) {
                    num = 3 * num + 1;
                    System.out.println(num);
                }
            }
        }
    }
}
