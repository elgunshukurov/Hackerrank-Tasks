package Others;

import java.util.Scanner;

public class JavaIfElse {
    /**Given an integer, n, perform the following conditional actions:
     *
     * If n is odd, print Weird
     * If n is even and in the inclusive range of 2 to 5, print Not Weird
     * If n is even and in the inclusive range of 6 to 20, print Weird
     * If n is even and greater than 20, print Not Weird
     * Complete the stub code provided in your editor to print whether or not  is weird.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c1 = "weird";
        String c2 = "not weird";

        if (n%2!=0){
            System.out.println(c1);
        }else if (n%2==0 && n>=2 && n<=5){
            System.out.println(c2);
        }else if (n%2==0 && n>=6 && n<=20){
            System.out.println(c1);
        }else if (n%2==0 && n>20){
            System.out.println(c2);
        }
    }

}
