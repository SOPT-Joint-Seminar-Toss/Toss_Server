package com.sopt.toss.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
public enum Success {

    /**
     * 200 SUCCESS
     */
    ASSERT_SUCCESS(HttpStatus.OK, "메인 자산 조회 성공입니다."),
    PRODUCT_SUCCESS(HttpStatus.OK, "공동 구매 조회 성공입니다."),
    BRAND_SUCCESS(HttpStatus.OK, "인기 브랜드콘 조회 성공입니다."),
    BRAND_DETAIL_SUCCESS(HttpStatus.OK, "브랜드콘 상세 조회 성공입니다."),
    PRODUCT_LIKE_SUCCESS(HttpStatus.OK, "좋아요 요청 성공입니다."),
    PRESENT_SUCCESS(HttpStatus.OK, "선물하기 요청 성공입니다.");


    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
