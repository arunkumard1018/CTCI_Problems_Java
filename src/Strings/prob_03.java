package Strings;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the
 * additional characters, and that you are given the "true" length of the string.
 * EXAMPLE
 * Input: "Mr John Smith     ", 13
 * Output: "Mr%20John%20Smith"
 */
public class prob_03 {
    public static String URLify(String st, int trueLen) {
        char[] data = st.toCharArray();
        int spacecount = 0;
        for (int i = 0; i < trueLen; i++) {
            if(st.charAt(i) == ' ') spacecount++;
        }
        int index = trueLen + spacecount*2 ;
        for (int i = trueLen - 1; i >= 0; i--) {
            if (data[i] == ' ') {
                data[index-1] = '0';
                data[index-2] = '2';
                data[index-3] = '%';
                index = index - 3;
            }else{
                data[index-1] = data[i];
                index--;
            }
        }
        return new String(data);
    }

    public static void main(String[] args) {
        String st = "Mr John Smith     ";
        System.out.println(URLify(st,13));
    }
}
