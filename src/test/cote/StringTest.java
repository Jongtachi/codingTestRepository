package test.cote;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {

        String testData = "Zbpklxqszabc";

        char[] charArr = testData.toCharArray();
        Arrays.sort(charArr);

        String answer = new String(charArr);
        answer = new StringBuilder(answer).reverse().toString();

        System.out.println(answer);


        // 2.
        String Test2= "ddd1234";
        
    }
}
