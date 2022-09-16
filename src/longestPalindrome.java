import java.util.Scanner;

public class longestPalindrome {

    private static String LongestPalindromicSubstring(String input) {
        if(input.isEmpty()) {
            return "";
        }
        int n = input.length();
        int longestSoFar = 0, startIndex = 0, endIndex = 0;
        boolean[][] palindrome = new boolean[n][n];

        for(int j = 0; j < n; j++) {
            palindrome[j][j] = true;
            for(int i = 0; i < j; i++) {
                if(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrome[i+1][j-1])) {
                    palindrome[i][j] = true;
                    if(j-i+1 > longestSoFar) {
                        longestSoFar = j-i+1;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        return input.substring(startIndex, endIndex+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(LongestPalindromicSubstring(input));
    }
}