package Strings;

/**
 * program to check the given String contains only unique characters
 */
public class Prob_01 {
    /**
     * @param st
     * @return true if the string contains unique chars
     */
    public static boolean isUnique(String st) {
        if (st.length() > 128) return false;
        // Assuming string is belongs to Ascii char set
        boolean[] flag = new boolean[128];
        for (int i = 0; i < st.length(); i++) {
            if(flag[st.charAt(i)]) return false;
            else flag[st.charAt(i)] = true;
        }
        return true;
    }

    /**
     * using bit wise operators
     * Assuming the String contains only lowerCase characters from 'a' to 'z'
     */
    public static boolean isUniqeChars(String st) {
        int flag = 0;
        for (int i = 0; i < st.length(); i++) {
            int mask = st.charAt(i) - 'a';
            if ((flag & (1 << mask)) != 0) {
                return false;
            }else flag = flag | (1<<mask);
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "arunkumar";
        System.out.println("String contains unique chars "+isUniqeChars(st));
    }
}
