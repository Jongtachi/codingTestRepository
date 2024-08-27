package test.basictest;

public class SplitTest {
    public static void main(String[] args) {
        String testStr = " 증빙일자 거래처 지출내역 금액 2024-08-19 맥도날드 식대 10,000 2024-08-19 서브웨이 식대 20,000 합계 tot2015 30,000 영수 및 청구 내용 ";

        String arr[] = testStr.split(" ");

        System.out.println(arr);
        for (String s : arr){
            System.out.println(s);
        }

        int totIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if ("tot2015".equals(arr[i])) {
                totIndex = i;
                break;
            }
        }

        System.out.println(totIndex);
    }
}
