package src.section1_String;

import java.util.Scanner;

public class S1_P5_FlipSpecificCharacters {
    /*특정문자뒤집기*/
    // 선생님 답
    public static String solution(String str){
        String answer="";
        // 문자배열 만들어주는 함수
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if(!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        // 문자배열을 문자로 변경
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
