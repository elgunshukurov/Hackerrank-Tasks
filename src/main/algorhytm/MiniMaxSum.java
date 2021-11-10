import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Reesult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // 256741038 623958417 467905213 714532089 938071625
        System.out.println(arr);
        Long min = 0L;
        Long max = 0L;

        Collections.sort(arr);
        System.out.println(arr);


        for (int i=0;i<arr.size()-1;i++){
            min += arr.get(i);
            max += arr.get(i+1);
        }

        System.out.println(min + " " + max);

    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Reesult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
