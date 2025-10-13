package src.section2_Array;

import java.util.Scanner;

public class S2_P4_FibonacciSequence {
    /** 피보나치 수열 */
    public static int[] solution(int n){;
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            if(i>1){
                answer[i] = answer[i-1] + answer[i-2];
            } else {
                answer[i] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = solution(n);
        for(int i=0; i<n; i++){
            System.out.print(A[i] + " ");
        }
    }
}
