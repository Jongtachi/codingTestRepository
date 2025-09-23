package src.section1_String;

import java.util.Scanner;


public class P12_Password {
    /*12. 암호*/
    public static String solution(String str1, String str2){
        String answer ="";

        int binaryStrSize = Integer.parseInt(str1);
        String[] binaryStr = new String[binaryStrSize];

        int s = 0;
        String temp = "";
        for(int i=0;i<str2.length();i++){
            String x = "0";
            if(String.valueOf(str2.charAt(i)).equals("#")) {
                x = "1";
            }
            temp += x;
            if((i+1)%7==0) {
                binaryStr[s] = temp;
                temp = "";
                s++;
                if(binaryStrSize==s){
                    break;
                }
            }
        }
        
        // 십진법으로 변환 후 아스키코드로 변환
        for(int j=0;j<binaryStr.length;j++){
            int decimal = Integer.parseInt(binaryStr[j], 2); // 2진법으로 해석하여 10진수로 변환
            char asciiChar = (char) decimal;
            answer+=asciiChar;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
