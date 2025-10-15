package src.section2_Array;

import java.util.Scanner;

public class S2_P5_Decimal {
    /**
     * 소수(에라토스테네스 체)
     * 직접적으로 이중 for 문을 사용하지 않은 이유: 시간 복잡도가 O(N^2)가 나오기 때문에 Time Limit Exceeded(시간초과)가 뜬다.
     * */
    public static int solution(int n){;
        int answer = 0;
        int[] arrInt = new int[n+1];
        for(int i=2; i<=n; i++){
            if(arrInt[i]==0) {
                answer++;
                for(int j=i; j<=n; j=j+i) {
                    arrInt[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = solution(n);
        System.out.print(cnt);
    }
}
