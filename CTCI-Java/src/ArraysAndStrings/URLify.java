package ArraysAndStrings;

public class URLify {
    public static void main(String[] args) {
        System.out.println(checkURLify("My name Bhavana    ", 15));
        System.out.println(checkURLify("Mr John Smith    ", 13));
    }

    private static char[] checkURLify(String str, int len) {
        char[] newStr = str.toCharArray();
        int index = 0;
        int countSpaces = 0;
        for (int i = 0; i < len; i++) {
            if (' ' == newStr[i]){
                countSpaces++;
            }
        }

        index = len + countSpaces * 2;
        System.out.println(index);
        System.out.println(str.length());

        System.out.println(newStr.length);
        System.out.println(newStr);
        if (newStr.length > len) newStr[len] = '\0';
        System.out.println(newStr.length);
        System.out.println(newStr);


        for (int i = len - 1; i >= 0 ; i--) {
            if (newStr[i] == ' '){
                newStr[index - 1] = '0';
                newStr[index - 2] = '2';
                newStr[index - 3] = '%';
                index -= 3;
            }else {
                newStr[index - 1] = newStr[i];
                index--;
            }
            
        }

        return newStr;
    }
}
