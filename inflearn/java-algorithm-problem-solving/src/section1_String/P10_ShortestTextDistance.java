package src.section1_String;

import java.util.Map;
import java.util.Scanner;


public class P10_ShortestTextDistance {
    /*10. 가장 짧은 문자거리*/
    public static int[] solution(String str1, String str2){
        int[] answer = new int[str1.length()];

        char[] strNum = str1.toCharArray();

        // 그냥 임의로 크게 1000
        int p = 1000;

        // 왼쪽에서부터
        for(int i=0; i < str1.length(); i ++){
            if(str2.equals(String.valueOf(strNum[i]))){
                p=0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 그냥 임의로 크게 1000
        p = 1000;
        // 오른쪽에서부터
        for(int i=str1.length()-1; i >= 0; i --){
            if(str2.equals(String.valueOf(strNum[i]))){
                p=0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        for(int n : solution(str1, str2)){
            System.out.print(n + " ");
        }

    }
}
