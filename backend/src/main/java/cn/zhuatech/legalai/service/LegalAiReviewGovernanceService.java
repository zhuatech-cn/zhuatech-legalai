/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai.service;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Service
public class LegalAiReviewGovernanceService {
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public Assessment assess(Request request) {
        List<String> blockers = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        if (!request.sourceCitationsVerified()) blockers.add("AI 结论的来源引用未验证");
        if (!request.clauseTraceabilityComplete()) blockers.add("结论与合同条款的追溯关系不完整");
        if (request.hallucinationRiskHigh()) blockers.add("存在较高的模型幻觉风险");
        if (!request.jurisdictionConfirmed()) blockers.add("适用法域尚未确认");
        if (!request.confidentialityControlsEnabled()) blockers.add("合同保密控制未启用");
        if (!request.finalApprovalComplete()) blockers.add("最终法律审批未完成");
        if (!blockers.isEmpty()) {
            actions.add("阻断法律意见发布并由合格人员复核证据与适用法律");
            return new Assessment(Decision.BLOCKED, blockers, actions);
        }
        if (!request.modelVersionRecorded() || !request.qualifiedCounselApproved()
                || !request.privilegeHandlingConfirmed()) {
            if (!request.modelVersionRecorded()) actions.add("记录模型、提示词和知识库版本");
            if (!request.qualifiedCounselApproved()) actions.add("交由具备资质的法律人员复核");
            if (!request.privilegeHandlingConfirmed()) actions.add("确认法律特权和保密材料处理方式");
            return new Assessment(Decision.COUNSEL_REVIEW, blockers, actions);
        }
        actions.add("接受审查结果并归档来源、版本、审批和责任声明");
        return new Assessment(Decision.ACCEPT, blockers, actions);
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public record Request(@NotBlank String reviewId, boolean sourceCitationsVerified,
                          boolean clauseTraceabilityComplete, boolean modelVersionRecorded,
                          boolean hallucinationRiskHigh, boolean qualifiedCounselApproved,
                          boolean jurisdictionConfirmed, boolean confidentialityControlsEnabled,
                          boolean privilegeHandlingConfirmed, boolean finalApprovalComplete) {}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public record Assessment(Decision decision, List<String> blockers, List<String> actions) {}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public enum Decision { ACCEPT, COUNSEL_REVIEW, BLOCKED }
}
