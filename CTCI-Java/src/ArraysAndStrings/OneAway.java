package ArraysAndStrings;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(checkOneAway("pale", "pae"));
        System.out.println(checkOneAway("pale", "pale"));
        System.out.println(checkOneAway("pale", "pake"));
    }

    private static boolean checkOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return checkOneReplace(s1, s2);
        } else if (s1.length() + 1 == s2.length()) { //s2 is greater
            return checkOneEdit(s1, s2);
        } else if (s1.length() == s2.length() + 1) { //s1 is greater
            return checkOneEdit(s1, s2);
        } else {
            return false;
        }

    }

    private static boolean checkOneEdit(String s1, String s2) {
        int index1 = 0, index2 = 0;

        while (index1 < s1.length() & index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean checkOneReplace(String s1, String s2) {
        boolean found = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (found)
                    return false;
                found = true;
            }
        }
        return true;
    }
}
