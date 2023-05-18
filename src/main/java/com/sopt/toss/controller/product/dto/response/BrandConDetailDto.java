package com.sopt.toss.controller.product.dto.response;

import com.sopt.toss.domain.Product;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BrandConDetailDto {
    private Long id;
    private String imageUrl;
    private String brandTitle;
    private String productTitle;
    private int price;
    private int point;
    private boolean isLike;
    private int expiration;
    private String productInfo;

    public static BrandConDetailDto toDto(Product product, boolean isLike) {
        LocalDateTime todayLocalDate = LocalDateTime.now();
        int days = (int) (Duration.between(todayLocalDate, product.getExpiration()).toHours() / 24);
        return new BrandConDetailDto(
                product.getId(),
                product.getImageUrl(),
                product.getBrandTitle(),
                product.getProductTitle(),
                product.getPrice(),
                (product.getPrice() * 3) / 100,
                isLike,
                days,
                product.getInfo()
        );
    }
}
