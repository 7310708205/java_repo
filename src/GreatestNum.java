import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a >= b) {
            if(b >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
    }

}
