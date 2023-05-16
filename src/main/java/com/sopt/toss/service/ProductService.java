package com.sopt.toss.service;

import com.sopt.toss.controller.product.dto.response.BrandConDetailDto;
import com.sopt.toss.controller.product.dto.response.BrandConResDto;
import com.sopt.toss.controller.product.dto.response.ProductResDto;
import com.sopt.toss.domain.Like;
import com.sopt.toss.domain.Product;
import com.sopt.toss.domain.User;
import com.sopt.toss.exception.model.NotFoundException;
import com.sopt.toss.repository.GroupBuyingRepository;
import com.sopt.toss.repository.LikeRepository;
import com.sopt.toss.repository.ProductRepository;
import com.sopt.toss.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.sopt.toss.exception.Error.NOT_FOUND_PRODUCT_EXCEPTION;
import static com.sopt.toss.exception.Error.NOT_FOUND_USER_EXCEPTION;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final GroupBuyingRepository groupBuyingRepository;
    private final LikeRepository likeRepository;

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

    public BrandConDetailDto getBrandCon(long userId, Long productId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_PRODUCT_EXCEPTION, NOT_FOUND_PRODUCT_EXCEPTION.getMessage()));
        boolean isLike;
        Like like = likeRepository.findByUserAndProduct(user, product).orElse(null);
        if(like ==null) isLike = false;
        else isLike = like.isLike();
        return BrandConDetailDto.toDto(product, isLike);
    }

    @Transactional
    public void patchBrandConLike(long userId, Long productId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_PRODUCT_EXCEPTION, NOT_FOUND_PRODUCT_EXCEPTION.getMessage()));
        Like like;
        like = likeRepository.findByUserAndProduct(user, product).orElse(null);
        // 좋아요 없다면 생성, 있다면 좋아요 <-> 좋아요 취소
        if(like == null) like = Like.toEntity(user, product);
        else like.setLike(like.isLike());
        likeRepository.save(like);
    }
}
