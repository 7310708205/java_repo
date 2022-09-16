import java.util.Scanner;

public class ArrayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int odd = 0, even = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 1)
                odd++;
            else
                even++;
        }
        if(odd == n)
            System.out.print("Odd");
        else if(even == n)
            System.out.print("Even");
        else
            System.out.print("Mixed");

    }
}
