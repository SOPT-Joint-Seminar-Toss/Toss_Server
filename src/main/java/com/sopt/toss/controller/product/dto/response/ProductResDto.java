package com.sopt.toss.controller.product.dto.response;

import com.sopt.toss.domain.GroupBuying;
import java.time.format.DateTimeFormatter;
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
    private String endDate;

    public static ProductResDto toDto(GroupBuying groupBuying) {
        return new ProductResDto(
                groupBuying.getProduct().getId(),
                groupBuying.getProduct().getImageUrl(),
                groupBuying.getProduct().getProductTitle(),
                groupBuying.getDiscountRate(),
                (groupBuying.getProduct().getPrice() * groupBuying.getDiscountRate()) / 100,
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(groupBuying.getEndDate())
        );
    }
}
