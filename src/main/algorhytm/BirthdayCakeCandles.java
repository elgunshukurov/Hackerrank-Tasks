import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static long birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
//        Collections.sort(candles);
//        long res = 1;
//        for (int i = candles.size()-1; i >= 1 ; i--) {
//            if (candles.get(candles.size()-1).equals(candles.get(i - 1))){
//                res++;
//            }
//        }
//        return res;

        Integer max = Integer.MIN_VALUE;
        for (Integer candle : candles) {
            if (candle > max) {
                max = candle;
            }
        }

        int count = 0;
        for (Integer candle : candles) {
            if (candle.equals(max)){
                count++;
            }
        }

        return count;

    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        //int candlesCount = in.nextInt();

        List<Integer> candles = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            candles.add(99);
        }

        long result = Result.birthdayCakeCandles(candles);

        System.out.println(result);
    }
}
