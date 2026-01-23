package src.section2_Array;

import java.util.Arrays;
import java.util.Scanner;

public class S2_P8_ScoreRank {
    /**
     * 등수 구하기
     * */
    private static int[] Solution(int[] n){
        int[] answer = new int[n.length];
        /**
         * 이중 for문으로 비교
         * */
        for(int i=0 ; i<n.length; i++){
            int cnt = 1;
            for(int j=0; j<n.length;j++){
                // 두 숫자를 비교 시 클 때만 cnt를 올리니 동점이 나오면 같은 등수가 나온다.
                if(n[j] > n[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = Solution(arr);
        for(int x: result){
            System.out.print( x + " ");
        }
    }
}
