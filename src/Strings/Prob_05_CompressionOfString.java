package Strings;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class Prob_05_CompressionOfString {

    public static String Compress(String st) {
        int finalLength = countConsutives(st);
        if (finalLength >= st.length()) {
            return st;
        }
        StringBuilder str = new StringBuilder(finalLength);
        int countConsucative = 0;
        for (int i = 0; i < st.length(); i++) {
            countConsucative++;
            if ((i + 1) >= st.length() || st.charAt(i) != st.charAt(i+1)) {
                str.append(st.charAt(i));
                str.append(countConsucative);
                countConsucative = 0;
            }
        }
        return str.toString();
    }

    public static int countConsutives(String st) {
        int countConsucative = 0;
        int compressedLength = 0;
        for (int i = 0; i < st.length(); i++) {
            countConsucative++;
            if ((i + 1) >= st.length() || st.charAt(i) != st.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsucative).length();
                countConsucative = 0;
            }

        }
        return compressedLength;
    }

    public static void main(String[] args) {
        String st = "arrruunnn";
        System.out.println(Compress(st));
    }
}
