import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Massivin olcusunu daxil edin:");
        int n = in.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> intArr = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                intArr.add(in.nextInt());
            }
            list.add(i,intArr);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }

    }


}
