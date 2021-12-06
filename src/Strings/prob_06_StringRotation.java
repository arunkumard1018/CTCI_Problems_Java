package Strings;

/**
 * String Rotation: Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
 * of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
 * call to i5Sub5tring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class prob_06_StringRotation {
    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        /* Checking length of s1 == s2 and String is not empty */
        if (len == s2.length() && len != 0) {
            String s1s1 = s1+s1;
            return s1s1.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1,s2));
    }
}
