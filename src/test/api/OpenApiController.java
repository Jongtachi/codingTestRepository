package test.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OpenApiController {
    public static void main(String[] args) {
        // 현재 날짜 구하기
        LocalDate currentDate = LocalDate.now();

        // 현재 날짜에서 2개월 전 날짜 구하기
        LocalDate dateTwoMonthsAgo = currentDate.minusMonths(2);

        // 날짜를 'yyyyMMdd' 형식의 문자열로 변환하기 위한 포맷터
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 날짜를 문자열로 변환
        String currentDateString = currentDate.format(formatter);
        String dateTwoMonthsAgoString = dateTwoMonthsAgo.format(formatter);

        // 결과 출력
        System.out.println("현재 날짜: " + currentDateString);
        System.out.println("2개월 전 날짜: " + dateTwoMonthsAgoString);

        // 다른 곳에 문자열로 넘길 수 있습니다.
        // 예: someMethod(currentDateString, dateTwoMonthsAgoString);

    }
}
