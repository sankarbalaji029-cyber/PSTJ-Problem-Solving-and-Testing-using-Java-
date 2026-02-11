import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here

    String ampm = s.substring(s.length() - 2);
    // Extract the hour part
    String hourString = s.substring(0, 2);
    // Extract the middle part (:mm:ss)
    String restOfTime = s.substring(2, s.length() - 2);
    
    int hour = Integer.parseInt(hourString);
    
    if (ampm.equals("AM")) {
        // If it's 12AM, change to 00
        if (hour == 12) {
            hourString = "00";
        }
        // Otherwise, the hour stays the same (and is already padded)
    } else {
        // If it's PM and NOT 12, add 12 to the hour
        if (hour != 12) {
            hour += 12;
            hourString = String.valueOf(hour);
        }
        // If it's 12PM, it stays 12
    }
    
    return hourString + restOfTime;

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
