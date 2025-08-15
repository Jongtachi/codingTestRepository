package src.section1_String;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class P6_RemoveDuplicateCharacters {
    /*중복문자제거*/
    // 선생님 답
    public static String solution(String str){
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (seen.add(c)) { // 처음 보는 문자면 true
                sb.append(c);
            }
        }
        return sb.toString(); // answer 변수 없이 바로 반환
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
