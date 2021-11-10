package DataStructures;
import java.util.*;

public class OneDArray {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] a = new int[n];

//            Arrays.stream(a).forEach(e -> scan.nextInt());

            Arrays.setAll(a, i -> scan.nextInt());

            scan.close();
            Arrays.stream(a).sorted().forEach(System.out::println);
        }
}
