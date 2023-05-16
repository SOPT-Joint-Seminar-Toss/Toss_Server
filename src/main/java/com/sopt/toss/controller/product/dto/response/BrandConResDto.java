package com.sopt.toss.controller.product.dto.response;

import com.sopt.toss.domain.GroupBuying;
import com.sopt.toss.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BrandConResDto {
    private Long id;
    private String imageUrl;
    private String brandTitle;
    private String productTitle;
    private int price;
    private int point;

    public static BrandConResDto toDto(Product product) {
        return new BrandConResDto(
                product.getId(),
                product.getImageUrl(),
                product.getBrandTitle(),
                product.getProductTitle(),
                product.getPrice(),
                (product.getPrice() * 3) / 100
        );
    }
}
