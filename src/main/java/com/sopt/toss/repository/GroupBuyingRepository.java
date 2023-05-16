package com.sopt.toss.repository;

import com.sopt.toss.domain.GroupBuying;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface GroupBuyingRepository extends Repository<GroupBuying, Long> {
    List<GroupBuying> findAllBy();
}
