package com.sopt.toss.repository;

import com.sopt.toss.domain.ProductLike;
import com.sopt.toss.domain.Product;
import com.sopt.toss.domain.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface ProductLikeRepository extends Repository<ProductLike, Long> {
    Optional<ProductLike> findByUserAndProduct(User user, Product product);

    void save(ProductLike productLike);
}
