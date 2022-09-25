import java.util.Scanner;

public class MaxAmountOFWater {

    public int MaximumArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right) {
            int width = right - left;
            int height1 = Math.min(height[left], height[right]);
            int area = height1 * width;
            maxWater = Math.max(maxWater, area);

            if(height[left] < height[right])
                left++;
            else if(height[left] > height[right])
                right--;
            else {
                left++;  right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        MaxAmountOFWater maximum = new MaxAmountOFWater();

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] height = new int[n];

        for(int i=0; i<n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(maximum.MaximumArea(height));
    }
}
