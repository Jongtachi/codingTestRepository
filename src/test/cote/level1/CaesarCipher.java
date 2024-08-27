package test.cote.level1;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "A b";
        int n = 1;

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // 공백 처리
            if(c == ' '){
                answer.append(' ');
                continue;
            }

            // 대문자 처리
            if(Character.isUpperCase(c)){
                char shifted = (char) ((c - 'A' + n )% 26 + 'A');
                answer.append(shifted);
            } else if (Character.isLowerCase(c)) {
                char shifted = (char) ((c - 'a' + n )% 26 + 'a');
                answer.append(shifted);
            }
        }

        System.out.println(answer.toString());
    }
}
