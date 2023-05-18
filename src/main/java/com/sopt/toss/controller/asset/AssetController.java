package com.sopt.toss.controller.asset;

import com.sopt.toss.common.dto.ApiResponse;
import com.sopt.toss.controller.asset.dto.response.AssetResDto;
import com.sopt.toss.exception.Success;
import com.sopt.toss.service.AssetService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.sopt.toss.common.Constant.Constant.AUTHORIZATION;

@RequestMapping("/asset")
@RequiredArgsConstructor
@RestController
public class AssetController {
    private final AssetService assetService;

    /**
     * [GET] 메인 자산
     */
    @GetMapping
    public ApiResponse<List<AssetResDto>> getAssets(HttpServletRequest request) {
        long userId = Long.parseLong(request.getHeader(AUTHORIZATION));
        return ApiResponse.success(Success.ASSERT_SUCCESS, assetService.getAssets(userId));
    }
}
