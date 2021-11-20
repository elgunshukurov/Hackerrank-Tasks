package DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new LinkedList();

        for(int i=0; i<N; i++) {
            list.add(scan.nextInt());
        }

        int Q = scan.nextInt();

        for(int i=0; i<Q; i++) {
            String act = scan.next();
            if(act.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x,y);
            } else if (act.equals("Delete")) {
                int x = scan.nextInt();
                list.remove(x);
            }
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
