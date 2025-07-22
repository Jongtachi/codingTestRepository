package src.section1_String;

import java.util.Scanner;

public class P4_FlipWords {
    /*단어 뒤집기*/
    // 내가 쓴 답
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();

        for(int i=0; i<cnt; i++) {
            String str = in.next();
            StringBuffer sb = new StringBuffer(str);
            String reversedStr = sb.reverse().toString();

            System.out.println(reversedStr);;
        }
    }
}
