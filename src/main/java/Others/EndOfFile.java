package Others;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;

        while ( n<=3){
            String string = sc.nextLine();
            System.out.println(n+" " + string);
            n++;
        }
    }
}
