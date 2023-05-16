package com.sopt.toss.service;

import com.sopt.toss.controller.product.dto.response.BrandConResDto;
import com.sopt.toss.controller.product.dto.response.ProductResDto;
import com.sopt.toss.repository.GroupBuyingRepository;
import com.sopt.toss.repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final GroupBuyingRepository groupBuyingRepository;

    public List<ProductResDto> getProducts() {
        return groupBuyingRepository.findAllBy()
                .stream()
                .map(ProductResDto::toDto)
                .collect(Collectors.toList());
    }

    public List<BrandConResDto> getBrandCons() {
        return productRepository.findAllBy()
                .stream()
                .map(BrandConResDto::toDto)
                .collect(Collectors.toList());
    }
}
