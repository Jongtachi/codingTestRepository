package src.section2_Array;

import java.util.Scanner;

public class S2_P7_ScoreCalculation {
    public static int solution(int[] n){
        int answer = 0;

        for(int i=0; i<n.length-1; i++){
            if(n[i] >= 1 && n[i+1] >= 1){
                n[i+1] = n[i] + 1;
            }
        }

        for(int i=0; i<n.length; i++){
            answer += n[i];
        }

        return answer;
    }
    /**
     * 점수 계산
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(arr));

    }
}
