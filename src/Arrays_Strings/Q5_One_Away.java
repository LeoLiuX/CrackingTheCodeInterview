package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q5_One_Away {
    public static void main(String[] args){
        String baseStr = "pale";
        String oneDelStr = "pae";
        String oneRepStr = "bale";
        String oneInsStr = "palle";
        String errStr = "pallle";

        System.out.println(oneDelStr + " : " + oneAwayCheck(baseStr, oneDelStr));
        System.out.println(oneRepStr + " : " + oneAwayCheck(baseStr, oneRepStr));
        System.out.println(oneInsStr + " : " + oneAwayCheck(baseStr, oneInsStr));
        System.out.println(errStr + " : " + oneAwayCheck(baseStr, errStr));


    }
    private static boolean oneAwayCheck(String s1, String s2){
        int cnt = 0;
        if (isOneDel(s1,s2))
            return true;
        if (isOneIns(s1,s2))
            return true;
        if (isOneRep(s1,s2))
            return true;
        return false;
    }

    private static boolean isOneDel(String s1, String s2){
        if (s1.length() != s2.length() + 1){
            return false;
        }
        int difCnt = 0;
        int[] chMap = new int[128];
        for (int i=0; i<s2.length(); i++){
            chMap[s2.charAt(i)]++;
        }
        for (int i=0; i < s1.length(); i++){
            int num = chMap[s1.charAt(i)]--;
            if (num < 0){
                difCnt++;
                if (difCnt > 1){
                    return false;
                }
            }
        }
        System.out.print("One Delete: ");
        return true;
    }

    private static boolean isOneRep(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int difCnt = 0;
        int[] chMap = new int[128];
        for (int i=0; i<s2.length(); i++){
            chMap[s2.charAt(i)]++;
        }
        for (int i=0; i < s1.length(); i++){
            int num = chMap[s1.charAt(i)]--;
            if (num < 0){
                difCnt++;
                if (difCnt > 1){
                    return false;
                }
            }
        }
        System.out.print("One Replace: ");
        return true;
    }

    private static boolean isOneIns(String s1, String s2){
        if (s1.length() != s2.length() - 1){
            return false;
        }
        int difCnt = 0;
        int[] chMap = new int[128];
        for (int i=0; i<s1.length(); i++){
            chMap[s1.charAt(i)]++;
        }
        for (int i=0; i<s2.length(); i++){
            int num = chMap[s2.charAt(i)]--;
            if (num < 0){
                difCnt++;
                if (difCnt > 1){
                    return false;
                }
            }
        }
        System.out.print("One Insert: ");
        return true;
    }

}
