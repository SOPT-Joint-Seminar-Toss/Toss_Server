package com.sopt.toss.controller.asset;

import com.sopt.toss.common.dto.ApiResponse;
import com.sopt.toss.controller.asset.dto.response.AssetResDto;
import com.sopt.toss.service.AssetService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/asset")
@RequiredArgsConstructor
@RestController
public class AssetController {
    private final AssetService assetService;

    @GetMapping
    public ApiResponse<List<AssetResDto>> getAssets() {
        /* TODO */
        return null;
    }
}
