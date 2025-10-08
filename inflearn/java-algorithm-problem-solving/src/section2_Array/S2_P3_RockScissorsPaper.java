package src.section2_Array;

import java.util.Scanner;

public class S2_P3_RockScissorsPaper {
    /**
     * 가위바위보
     * 1:가위
     * 2:바위
     * 3:보
     * */
    public static String solution(int i, String[] A, String[] B){
        String answer = "A";
        if (A[i].equals(B[i])){
            answer = "D";
        } else {
            switch(A[i]){
                case "1":
                    if(B[i].equals("2")) {answer="B";}
                    break;
                case "2":
                    if(B[i].equals("3")) {answer="B";}
                    break;
                case "3":
                    if(B[i].equals("1")) {answer="B";}
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 자기야 사랑해 ♥
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] A = new String[n];
        String[] B = new String[n];

        // A사람 가위바위보 정보
        for(int i=0; i<n; i++){
            A[i] = in.next();
        }
        // B사람 가위바위보 정보
        for(int i=0; i<n; i++){
            B[i] = in.next();
        }

        for(int i=0; i<n; i++){
            System.out.println(solution(i, A, B));
        }
    }
}
