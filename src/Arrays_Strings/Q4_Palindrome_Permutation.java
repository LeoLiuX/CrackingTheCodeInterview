package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q4_Palindrome_Permutation {
    public static void main(String[] args){
        String baseStr = "Tact Coa";
        String errStr = "asdfsa";
        System.out.println(palindromePermutation(baseStr));
        System.out.println(palindromePermutation(errStr));
    }

    private static boolean palindromePermutation(String s1){
        int oddCnt = 0;
        int[] charMap = new int[128];
        for (int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            c = Character.toLowerCase(c);
            if (c != ' ') {
                charMap[c]++;
                if (charMap[c] % 2 == 0){
                    oddCnt--;
                }
                else oddCnt++;
            }

        }

        if (oddCnt > 1){
            return false;
        }
        return true;
    }
}
