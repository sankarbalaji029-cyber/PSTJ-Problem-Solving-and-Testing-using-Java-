import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            int mid = n / 2;

            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            // first half
            for (int i = 0; i < mid; i++) {
                freq1[s.charAt(i) - 'a']++;
            }
            for (int i = (n % 2 == 0 ? mid : mid + 1); i < n; i++) {
                freq2[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(freq1, freq2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
