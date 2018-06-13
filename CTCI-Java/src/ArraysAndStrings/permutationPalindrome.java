package ArraysAndStrings;

public class permutationPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPermutationPalindrome("TacocaT"));
    }

    private static boolean checkPermutationPalindrome(String str) {
        System.out.println(Character.getNumericValue('z'));
        System.out.println(Character.getNumericValue('a'));
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        System.out.println(table.length);
        System.out.println("===========");

        int countOdd = 0;
        for (char c :
                str.toCharArray()) {
            int x = getIntegerValue(c);
            System.out.println(x);
            table[x]++;
            if (table[x]%2 == 1){
                countOdd++;
            }else {
                countOdd--;
            }
        }

        System.out.println("===========");

        return countOdd <= 1;
    }

    private static int getIntegerValue(char c) {
        int z = Character.getNumericValue('z');
        int a = Character.getNumericValue('a');
        int cc = Character.getNumericValue(c);

        if (a <= cc & cc <= z){
            return cc - a;
        }

        return -1;
    }
}
