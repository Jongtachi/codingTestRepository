package test.api;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class ApiTestTorridenCorCard {
    public static void main(String[] args) {
        String apiId = "0411A";
        String apiKey = "47862a7e-71e8-a060-b9f5-a6a6012f756d";
        String orgCd = "7608600222";

        String jsonInputString = String.format("{\n" +
                "   \"API_ID\": \"%s\",\n" +
                "   \"API_KEY\": \"%s\",\n" +
                "   \"ORG_CD\": \"%s\",\n" +
                "   \"REQ_DATA\": {\n" +
                "       \"BIZ_NO\": \"%s\",\n" +
                "       \"CARD_NO\": \"\",\n" +
                "       \"APV_NO\": \"\",\n" +
                "       \"START_DATE\": \"20240701\",\n" +
                "       \"START_TIME\": \"\",\n" +
                "       \"END_DATE\": \"20240717\",\n" +
                "       \"END_TIME\": \"\",\n" +
                "       \"PROC_STS\": \"\",\n" +
                "       \"APPR_STS\": \"\",\n" +
                "       \"RCV_STS\": \"\",\n" +
                "       \"REQ_SPLIT_YN\": \"Y\",\n" +
                "       \"CARD_TYPE\": \"\",\n" +
                "       \"REQ_CNT\": \"\",\n" +
                "       \"NEXT_KEY\": \"\"\n" +
                "   }\n" +
                "}", apiId, apiKey, orgCd, orgCd);

        try {
            // JSON 문자열을 URL 인코딩합니다.
            String encodedJsonInputString = URLEncoder.encode(jsonInputString, "UTF-8");

            // GET 요청의 쿼리 파라미터로 URL 인코딩된 JSON 데이터를 추가합니다.
            String uri = String.format("https://webankapi.appplay.co.kr/gateway.do?JSONData=%s", encodedJsonInputString);

            // HttpRequest 객체를 빌드합니다.
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .GET()
                    .build();

            // 요청을 비동기로 전송하고 응답을 처리합니다.
            HttpClient client = HttpClient.newHttpClient();
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
