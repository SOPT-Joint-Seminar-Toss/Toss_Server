package com.sopt.toss.controller.product;

import com.sopt.toss.common.dto.ApiResponse;
import com.sopt.toss.controller.product.dto.response.BrandConDetailDto;
import com.sopt.toss.controller.product.dto.response.BrandConResDto;
import com.sopt.toss.controller.product.dto.response.ProductResDto;
import com.sopt.toss.exception.Success;
import com.sopt.toss.service.ProductService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sopt.toss.common.Constant.Constant.AUTHORIZATION;

@RequestMapping("/product")
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    /**
     * [GET] 공동 구매
     */
    @GetMapping
    public ApiResponse<List<ProductResDto>> getProducts() {
        return ApiResponse.success(Success.PRODUCT_SUCCESS, productService.getProducts());
    }

    /**
     * [GET] 브랜드콘
     */
    @GetMapping("/brand")
    public ApiResponse<List<BrandConResDto>> getBrandCons() {
        return ApiResponse.success(Success.PRODUCT_SUCCESS, productService.getBrandCons());
    }

    /**
     * [GET] 브랜드콘 상세보기
     */
    @GetMapping("/brand/{productId}")
    public ApiResponse<BrandConDetailDto> getBrandCon(
            @PathVariable Long productId,
            HttpServletRequest request
    ) {
        long userId = Long.parseLong(request.getHeader(AUTHORIZATION));
        return ApiResponse.success(Success.PRODUCT_SUCCESS, productService.getBrandCon(userId, productId));
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
