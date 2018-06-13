package ArraysAndStrings;

public class isUnique {
    public static void main(String[] args) {
        System.out.println(checkUnique("AdBCD"));
//        System.out.println(checkUnique("AABCD"));
    }

    private static boolean checkUnique(String abc) {
        if (abc.length() > 128) return false;

        boolean[] check = new boolean[128];
        for (int i = 0; i < abc.length(); i++) {
            if (check[abc.charAt(i)])
                return false;
            check[abc.charAt(i)] = true;
//            System.out.println(abc.charAt(i));
//            int val = abc.charAt(i); stores 65 for 'A'
//            System.out.println(val);
            System.out.println(check[abc.charAt(i)]);
        }
        return true;
    }
}
