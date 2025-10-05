package src.section2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_P1_PrintingLargeNum {
    /*큰 수 출력하기*/
    // 강사님이 쓴 답
    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if (arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] intArr = new int[n];
        for(int i=0; i<n; i++){
            intArr[i] = in.nextInt();
        }

        for(int x : solution(n, intArr)){
            System.out.print(x + " ");
        }
    }
}
