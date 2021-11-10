public class StringReverse {
    public static void main(String[] args) {
        String s = "madam";
        boolean palindrom = true;
        for (int i = s.length()-1, l=0; i >= 0; i--, l++) {
            if (s.charAt(i) != s.charAt(l) && i != l) {
                palindrom = false;
                break;
            }
        }
        if (!palindrom) System.out.println("No");
        else System.out.println("Yes");
    }
}
