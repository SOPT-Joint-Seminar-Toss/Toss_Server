package com.sopt.toss.controller.product;

import com.sopt.toss.common.dto.ApiResponse;
import com.sopt.toss.controller.product.dto.response.BrandConDetailDto;
import com.sopt.toss.controller.product.dto.response.BrandConResDto;
import com.sopt.toss.controller.product.dto.response.ProductResDto;
import com.sopt.toss.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ApiResponse<List<ProductResDto>> getProducts() {
        return null;
    }

    @GetMapping("/brand")
    public ApiResponse<List<BrandConResDto>> getBrandCons() {
        return null;
    }

    @GetMapping("/brand/{productId}")
    public ApiResponse<BrandConDetailDto> getBrandCon(
            @PathVariable String productId
    ) {
        return null;
    }

    @PatchMapping("/brand/{productId}")
    public ApiResponse patchBrandConLike(
            @PathVariable String productId
    ) {
        return null;
    }

    @PostMapping("/brand/present/{productId}")
    public ApiResponse postPresentProduct(
            @PathVariable String productId
    ) {
        return null;
    }
}
