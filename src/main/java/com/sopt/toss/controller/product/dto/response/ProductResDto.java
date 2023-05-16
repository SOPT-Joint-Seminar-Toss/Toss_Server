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

    public static ProductResDto toDto(GroupBuying groupBuying) {
        return new ProductResDto(
                groupBuying.getProduct().getId(),
                groupBuying.getProduct().getImageUrl(),
                groupBuying.getProduct().getProductTitle(),
                groupBuying.getDiscountRate(),
                (groupBuying.getProduct().getPrice() * groupBuying.getDiscountRate()) / 100,
                groupBuying.getEndDate()
        );
    }
}
