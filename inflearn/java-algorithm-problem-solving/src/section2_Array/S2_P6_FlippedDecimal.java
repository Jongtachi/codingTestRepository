package src.section2_Array;

import java.util.Scanner;

public class S2_P6_FlippedDecimal {
    /**
     * 뒤집은 소수
     * */
    public static boolean solution(int n){;
        // 1이하는 소수가 아님
        if (n <= 1) return false;
        // 2는 소수
        if (n == 2) return true;
        // 짝수는 소수가 아님
        if (n % 2 == 0) return false;

        // 3부터 시작해서 i^2가 n 이하인 동안, 홀수만 나누어 본다. 하나라도 나누어 지면 n은 소수가 아니다.
        // n이 합성수라면, 반드시 √n 이하의 약수를 가진다
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int reverseNum(int n){
        int reversed = 0;

        while(n>0){
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 첫 줄에 자연수 N이 주어진다.
        int n = sc.nextInt();
        // 2. 다음 줄에는 N개의 정수를 입렵한다.
        int[] intArr = new int[n];
        for(int i=0; i<n; i++){
            intArr[i] = sc.nextInt();
        }

        for (int x : intArr) {
            int reversed = reverseNum(x);
            if(solution(reversed)){
                System.out.print(reversed + " " );
            }
        }
    }
}
