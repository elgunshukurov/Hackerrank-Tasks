package BigNumber;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalMain {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();in.nextLine();
//
//        List<BigDecimal> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            list.add(new BigDecimal(in.nextLine()));
//        }
//
//        list.sort(Collections.reverseOrder());
//        list.forEach(System.out::println);


        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here

        Arrays.
                sort(s, 0, n, (a, b) -> (new BigDecimal(b)).compareTo(new BigDecimal(a))
                );

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }


    }
}
