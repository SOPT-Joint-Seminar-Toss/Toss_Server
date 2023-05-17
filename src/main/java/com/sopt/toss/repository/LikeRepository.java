package com.sopt.toss.repository;

import com.sopt.toss.domain.Like;
import com.sopt.toss.domain.Product;
import com.sopt.toss.domain.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface LikeRepository extends Repository<Like, Long> {
    Optional<Like> findByUserAndProduct(User user, Product product);

    void save(Like like);
}
