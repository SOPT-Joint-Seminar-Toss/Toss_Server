package com.sopt.toss.repository;

import com.sopt.toss.domain.Product;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends Repository<Product, Long> {
    List<Product> findAllBy();
}
