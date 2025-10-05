package src.section2_Array;

import java.util.Scanner;

public class S2_P2_VisibleStudent {
    /*보이는 학생*/
    public static int solution(int n, int[] arr){
        int answer = 1;
        int maxTall = arr[0];
        for(int i=1; i<n; i++){

            if (arr[i]>maxTall) {
                answer++ ;
                maxTall = arr[i];
            }
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

        System.out.print(solution(n, intArr));
    }
}
