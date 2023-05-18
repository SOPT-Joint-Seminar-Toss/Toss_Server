package com.sopt.toss.repository;

import com.sopt.toss.domain.Present;
import com.sopt.toss.domain.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends Repository<Product, Long> {
    List<Product> findAllBy();

    Optional<Product> findById(Long productId);

    void save(Present present);
}
