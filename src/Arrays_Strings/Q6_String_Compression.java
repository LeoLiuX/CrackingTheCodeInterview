package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q6_String_Compression {
    public static void main(String[] args){
        String originStr = "aaabbccccd";
        System.out.println(compressString(originStr));
    }

    private static String compressString(String str){
        if (str.length() <= 1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char curCh = str.charAt(i);
            sb.append(curCh);
            int curCnt = 0;
            while (i + curCnt < str.length() && str.charAt(i + curCnt) == curCh){
                curCnt++;
            }
            i += curCnt - 1;
            sb.append(curCnt);
        }
        return sb.toString();
    }
}
