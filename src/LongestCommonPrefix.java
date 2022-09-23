import java.util.Scanner;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0)
            return "";
        String prefix = strings[0];

        for(int i=1; i<strings.length;i++) {
            while(strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp= new LongestCommonPrefix();

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Enter elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println( "Longest Common Prefix is : " + lcp.longestCommonPrefix(arr));
    }
}



