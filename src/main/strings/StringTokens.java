import java.util.ArrayList;
import java.util.Arrays;

public class StringTokens {
    public static void main(String[] args) {
        String s = "           ";
        System.out.println(s);
        if (s.trim().equals("")) System.out.println(0);
        else {
            String[] list = s.trim().split("[ .,?!`'_@]+");

            System.out.println(list.length);
            for (String value : list) {
                System.out.println(value.trim());
            }
        }


    }
}
