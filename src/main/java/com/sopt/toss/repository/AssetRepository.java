package com.sopt.toss.repository;

import com.sopt.toss.domain.Asset;
import com.sopt.toss.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    List<Asset> findAllByUser(User user);
}
