/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai.controller;

import cn.zhuatech.legalai.common.ApiResponse;
import cn.zhuatech.legalai.service.LegalAiReviewGovernanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enterprise/legalai")
public class LegalAiReviewGovernanceController {
    private final LegalAiReviewGovernanceService service;
    public LegalAiReviewGovernanceController(LegalAiReviewGovernanceService service) { this.service = service; }
    @PostMapping("/legal-review-governance")
    public ApiResponse<LegalAiReviewGovernanceService.Assessment> assess(
            @Valid @RequestBody LegalAiReviewGovernanceService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
