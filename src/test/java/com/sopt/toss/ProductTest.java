package com.sopt.toss;

import java.time.Duration;
import java.time.LocalDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    @DisplayName("상품 만료일 테스트")
    void productExpirationTest() {
        // given
        LocalDateTime startDateTime = LocalDateTime.of(2023, 4, 16, 9, 30, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 4, 20, 9, 30, 0);

        // when
        int days = (int) (Duration.between(startDateTime, endDateTime).toHours() / 24);

        // then
        assertEquals(4, days);
    }

}
