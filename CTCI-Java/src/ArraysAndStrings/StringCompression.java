package ArraysAndStrings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressedString("aabbccckk"));
        System.out.println(compressedString("aabbcckk"));
        System.out.println(compressedString("aa"));
    }

    private static String compressedString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return str.length() > stringBuilder.length() ? stringBuilder.toString() : str;
    }
}
