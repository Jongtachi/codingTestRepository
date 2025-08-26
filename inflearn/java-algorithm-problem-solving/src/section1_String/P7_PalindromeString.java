package src.section1_String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P7_PalindromeString {
    /*회문문자열: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열*/
    public static String solution(String str){
        StringBuilder stringBuildered = new StringBuilder(str);
        String reversedStr = String.valueOf(stringBuildered.reverse());
        if (str.toLowerCase().equals(reversedStr.toLowerCase())){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
