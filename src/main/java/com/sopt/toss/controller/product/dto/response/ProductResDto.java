package com.sopt.toss.controller.product.dto.response;

import com.sopt.toss.domain.GroupBuying;
import com.sopt.toss.domain.Product;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductResDto {
    private Long id;
    private String imageUrl;
    private String title;
    private int discountRate;
    private int price;
    private LocalDateTime endDate;

    public static ProductResDto toDto(Product product, GroupBuying groupBuying) {
        return new ProductResDto(
                product.getId(),
                product.getImageUrl(),
                product.getProductTitle(),
                groupBuying.getDiscountRate(),
                (product.getPrice() * groupBuying.getDiscountRate()) / 100,
                groupBuying.getEndDate()
        );
    }
}
