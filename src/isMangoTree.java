import java.util.*;

public class isMangoTree {
    public static void main(String[] args) {
        int row,col,numOfTrees;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        numOfTrees = sc.nextInt();

        if(numOfTrees >= 1 && numOfTrees <= col) {
            System.out.println("Yes");
        }
        else if(numOfTrees%col == 1 && numOfTrees%col == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}