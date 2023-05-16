package com.sopt.toss.service;

import com.sopt.toss.controller.asset.dto.response.AssetResDto;
import com.sopt.toss.domain.Asset;
import com.sopt.toss.domain.User;
import com.sopt.toss.exception.model.NotFoundException;
import com.sopt.toss.repository.AssetRepository;
import com.sopt.toss.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.sopt.toss.exception.Error.NOT_FOUND_USER_EXCEPTION;

@Service
@RequiredArgsConstructor
public class AssetService {
    private final AssetRepository assetRepository;
    private final UserRepository userRepository;

    public List<AssetResDto> getAssets(long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        List<Asset> asserts = assetRepository.findAllByUser(user);
        return asserts.stream().map(AssetResDto::toDto).collect(Collectors.toList());
    }
}
