package src.section1_String;

import java.util.Scanner;


public class S1_P11_StringCompression {
    /*11. 문자열 압축*/
//    public static String solution(String str){
//        String answer = "";
//        char[] s = str.toCharArray();
//        int num = 1;
//        for(int i=0; i < s.length ;i++){
//            //System.out.print(s[i]);
//            if(i==s.length-1) {
//                if (s[i] != s[i - 1]) {
//                    answer += s[i];
//                } else {
//                    answer += s[i];
//                    answer += String.valueOf(num);
//                }
//            } else {
//                if (s[i] != s[i + 1]) {
//                    answer += s[i];
//                    if (num != 1) {
//                        answer += String.valueOf(num);
//                        num = 1;
//                    }
//                } else {
//                    num++;
//                }
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.print(solution(str.toUpperCase()));
//
//    }
    // 강사님 답안
    public static String solution(String str){
        String answer = "";
        str = str+" ";  // 빈문자열 더해줌
        int cnt=1;
        for (int i=0; i<str.length()-1;i++){
            if (str.charAt(i)== str.charAt(i++)) cnt++;
            else {
                answer+=str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str.toUpperCase()));

    }
}
