package src.section1_String;

import java.util.Scanner;


public class S1_P8_ValidPalindrome {
    /*팰린드롬: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열*/
    public static String solution(String str){
        String answer = "NO";

        // replaceAll에는 정규식을 사용할 수 있다.
        // replace에는 정규식 사용 X
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자 A-Z가 아닌 것들은 ""로 변환
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * nextLine
         * 한 줄 전체를 읽어서 문자열로 반환합니다.
         * 개행(엔터)을 만나면 그 전까지 입력한 전체 문자열을 가져옵니다.
         * 즉, "문장 단위"로 입력을 받음.
         * */
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
