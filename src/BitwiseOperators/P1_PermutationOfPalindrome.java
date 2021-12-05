package BitwiseOperators;
/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of
 * a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 * EXAMPLE
 * Input: tactCoa
 * Output: True (permutations: "taco cat'; "atco eta·; etc.)
 */
public class P1_PermutationOfPalindrome {
    public static boolean isPermutationOfPalindrome(String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            int value = Character.getNumericValue(str.charAt(i)) - Character.getNumericValue('a');
            if(isSet(flag,value)){
                flag = UpdateBit(flag,value);
            }
            else{
                flag = UpdateBit(flag,value);
            }
        }
       return flag == 0 || isOnebitSetOnley(flag);
    }

    public static boolean isSet(int flag, int index) {
        return (flag & (1 << index)) != 0;
    }

    public static int UpdateBit(int flag,int index) {
        int mask = 1<<index;
        if(isSet(flag,index)){
            return flag & ~(mask);
        }
        return flag | mask;
    }

    public static boolean isOnebitSetOnley(int flag) {
        return (flag & (flag-1)) == 0;
    }

    public static void main(String[] args) {
        String str = "aruna";
        System.out.println("is PermutationOfPalindrome :"+isPermutationOfPalindrome(str));
    }

}
