package Strings;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of
 * a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 * EXAMPLE
 * Input: tactCoa
 * Output: True (permutations: "taco cat'; "atco eta·; etc.)
 */
public class prob_04 {
    public static boolean isPermutationPalindrome(String phrase) {
//        int[] charFreq = buildCharFrequencyTable(phrase);
//        return maxoneodd(charFreq);
        return buildCharFrequencyTable(phrase);
    }

    public static boolean buildCharFrequencyTable(String phrase) {
        int[] charFreq = new int['z'-'a'+1];
        int oddcount = 0, index;
        for (int i = 0; i < phrase.length(); i++) {
            index = phrase.charAt(i) - 'a';
            charFreq[index]++;
            if (charFreq[index] % 2 == 1) {
                oddcount++;
            }else{
                oddcount--;
            }
        }
//        return charFreq;
        return oddcount <= 1;
    }

    /**
     * we can check for max one odd while building char frequency table
     */
//    public static boolean maxoneodd(int[] charFreq) {
//        boolean flag = false;
//        for (int i = 0; i < charFreq.length; i++) {
//            if (charFreq[i] % 2 == 1) {
//                if(flag) return false;
//                else flag = true;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        String st = "tactca";
        System.out.println("is permutation of palindrome :"+isPermutationPalindrome(st));
    }
}
