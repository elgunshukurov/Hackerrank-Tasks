package Others;

import java.util.Scanner;

public class JavaLoopsII {
    /** a=5, b=3, c=4
     * result=a
     * result=result+ 1*3
     * result=result+ 2*3
     * result=result+ 4*3
     * result=result+ 8*3
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int n= sc.nextInt();
            int result = a;
            for (int j = 0, k =1; j < n; j++,k*=2) {
                result+=+k*b;
                System.out.printf("%d ",result);
            }
            System.out.printf("%n");
        }
    }
}
