import java.util.*;

public class Prog3 {
    public static void main(String[] args) {
        int r,c,m;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        m = sc.nextInt();

        if(m>=1 && m<=c) {
            System.out.println("Yes");
        }
        else if(m%c == 1 && m%c == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
