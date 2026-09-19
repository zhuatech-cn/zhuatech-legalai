/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai.controller;

import cn.zhuatech.legalai.common.ApiResponse;
import cn.zhuatech.legalai.service.LegalAiReviewGovernanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/legalai")
public class LegalAiReviewGovernanceController {
    private final LegalAiReviewGovernanceService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public LegalAiReviewGovernanceController(LegalAiReviewGovernanceService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/legal-review-governance")
    public ApiResponse<LegalAiReviewGovernanceService.Assessment> assess(
            @Valid @RequestBody LegalAiReviewGovernanceService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
