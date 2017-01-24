package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */

public class Q1_Is_Unique {
    private static final String testStrUnique = "abcde ipgk";
    private static final String testStr = "Hello World";

    public static void main(String[] args){
        System.out.println(isUnique(testStrUnique));
        System.out.println(isUnique(testStr));
    }

    private static boolean isUnique(String str){
        int[] charMap = new int[128];

        for (int i=0; i<str.length(); i++){
            if (charMap[str.charAt(i)] == 0){
                charMap[str.charAt(i)]++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
