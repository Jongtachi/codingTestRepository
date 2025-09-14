package src.section1_String;

import java.util.Scanner;


public class P9_ExtractOnlyNumbers {
    /*9. 숫자만 추출*/
    public static String solution(String str){
        String answer ="";
        // replaceAll에는 정규식을 사용할 수 있다.
        // replace에는 정규식 사용 X
        int number = Integer.valueOf(str.replaceAll("[^0-9]", "")); // 대문자 A-Z가 아닌 것들은 ""로 변환
        answer = String.valueOf(number);
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
