package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q3_URLify {
    private static char[] charStr = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' '};
    private static int length = 13;
    public static void main(String[] args){
        System.out.println(URLifyMethod(charStr, length));
    }

    private static char[] URLifyMethod(char[] str, int len){
        int spaceCnt = 0;
        for (int i = 0; i < len; i++){
            if (str[i] == ' '){
                spaceCnt++;
            }
        }
        char[] newStr = new char[len + spaceCnt * 2];
        for (int i=0, j=0; i<len && j<len+spaceCnt*2; i++, j++){
            if (str[i] == ' '){
                newStr[j] = '%';
                newStr[j+1] = '2';
                newStr[j+2] = '0';
                j += 2;
            }
            else {
                newStr[j] = str[i];
            }
        }
        return newStr;
    }
}
