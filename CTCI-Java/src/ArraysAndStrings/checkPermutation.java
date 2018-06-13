package ArraysAndStrings;

import static java.util.Arrays.sort;

public class checkPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("ABC","BAC"));
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (mySort(s1)).equals(mySort(s2));
    }

    private static String mySort(String str) {
        char[] c = str.toCharArray();
        sort(c);
        return new String(c);
    }
}
