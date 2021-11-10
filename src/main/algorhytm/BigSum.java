import java.util.ArrayList;
import java.util.List;

public class BigSum {
    public static void main(String[] args) {
        List<Long> longList = new ArrayList<>();
        longList.add(5521320L);
        longList.add(4032138L);
        longList.add(1212453L);
        longList.add(3424231L);
        System.out.println(aVeryBigSum(longList));
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (Long aLong : ar) {
            sum += aLong;
        }
        return sum;
    }

}
