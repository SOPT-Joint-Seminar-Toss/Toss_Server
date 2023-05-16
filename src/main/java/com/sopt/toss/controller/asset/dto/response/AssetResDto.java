package com.sopt.toss.controller.asset.dto.response;

import com.sopt.toss.domain.Asset;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AssetResDto {
    private Long id;
    private String title;
    private int balance;

    public static AssetResDto toDto(Asset asset) {
        return new AssetResDto(asset.getId(), asset.getTitle(), asset.getBalance());
    }
}
