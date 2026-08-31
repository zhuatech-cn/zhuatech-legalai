/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LegalAiReviewGovernanceServiceTest {
    private final LegalAiReviewGovernanceService service = new LegalAiReviewGovernanceService();
    @Test void acceptsControlledLegalReview() {
        var result = service.assess(new LegalAiReviewGovernanceService.Request("L1", true, true, true,
                false, true, true, true, true, true));
        assertThat(result.decision()).isEqualTo(LegalAiReviewGovernanceService.Decision.ACCEPT);
    }
    @Test void routesGovernanceGapsToCounsel() {
        var result = service.assess(new LegalAiReviewGovernanceService.Request("L2", true, true, false,
                false, false, true, true, false, true));
        assertThat(result.actions()).hasSize(3);
    }
    @Test void blocksUnsafeAiOpinion() {
        var result = service.assess(new LegalAiReviewGovernanceService.Request("L3", false, false, true,
                true, true, false, false, true, false));
        assertThat(result.blockers()).hasSize(6);
    }
}
