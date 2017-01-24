package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q2_Check_Permutation {
    private final static String str1 = "hello world";
    private final static String str2 = "lolehw ordl";
    private final static String str3 = "heoll sidol";

    public static void main(String[] args){
        System.out.println(checkPermutation(str1, str2));
        System.out.println(checkPermutation(str1,str3));
    }

    private static boolean checkPermutation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] charMap = new int[128];
        for (int i=0; i<s1.length(); i++){
            charMap[s1.charAt(i)]++;
        }

        for (int i=0; i<s2.length(); i++){
            if (--charMap[s2.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}
