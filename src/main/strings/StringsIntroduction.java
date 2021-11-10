public class StringsIntroduction {
    public static void main(String[] args) {
        String A="java";
        String B="hello";
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        if(A.charAt(0)>B.charAt(0)) System.out.println("yes");
        else System.out.println("No");
        System.out.println(A.replace(A.charAt(0),A.toUpperCase().charAt(0)) + " " +
                B.replace(B.charAt(0),B.toUpperCase().charAt(0)));
    }
}
