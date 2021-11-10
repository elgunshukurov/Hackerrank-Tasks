import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultTC {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        int hour = Integer.parseInt(s.substring(0,2));
        int min = Integer.parseInt(s.substring(3,5));
        int sec = Integer.parseInt(s.substring(6,8));

        if (s.endsWith("PM")) {
            if (hour!=12) hour+=12;
        }
        if (s.endsWith("AM")) {
            if (hour==12) hour=0;
        }

        LocalTime time = LocalTime.of(hour,min,sec);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {

        String s = "12:00:00AM";

        String result = ResultTC.timeConversion(s);

        System.out.println(result);
    }
}
