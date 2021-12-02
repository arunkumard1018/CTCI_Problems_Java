package Strings;

/**
 * Check Permutation: Given two strings, write a method to
 * decide if one is a permutation of the other.
 */
public class prob_02 {
    /**
     * 1st method Sort 2 Strings and check for equality because we know that
     * if two Strings are permutation to each other they contain same characters
     * in different order
     */
    public static boolean arePermutation(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        return Sort(s1).equals(Sort(s2));
    }
    public static String Sort(String s1) {
        char[] content = s1.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    /**
     * Because Sorting takes o(n log n) time
     * Solution #2: Check if the two strings have identical character counts.
     */
    public static boolean arePermutations(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] flag = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            flag[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            flag[s2.charAt(i)]--;
            if(flag[s2.charAt(i)] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aruna";
        String s2 = "aruna";
        System.out.println("Both Strings Are Permutation Each Other "+arePermutations(s1,s2));
    }
}
