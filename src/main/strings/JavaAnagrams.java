import java.util.Arrays;
import java.util.LinkedList;

public class JavaAnagrams {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "gramana";

        String resultP = "Anagrams";
        String resultN = "Not Anagrams";

        if (isAnagram(a, b)) System.out.println(resultP);
        else System.out.println(resultN);
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] aa = a.toLowerCase().toCharArray();
            char[] bb = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }


}
