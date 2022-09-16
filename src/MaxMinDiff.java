import java.util.Scanner;

public class MaxMinDiff {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = arr[0];
        int minVal = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > maxVal)
                maxVal = arr[i];
            else if(arr[i] < minVal)
                minVal = arr[i];
        }
        System.out.println("Difference between the maxValue & minValue: "+(maxVal-minVal));
    }
}
