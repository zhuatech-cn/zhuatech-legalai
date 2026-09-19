/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai.controller;import cn.zhuatech.legalai.common.ApiResponse;import cn.zhuatech.legalai.service.ClauseDeviationService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/legalai/insights/clause-deviation") public class ClauseDeviationController{private final ClauseDeviationService service;/**
                                                                                                                                                               * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                               */
public ClauseDeviationController(ClauseDeviationService service){this.service=service;}/**
                                                                                                                                                                                                                                                      * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                      */
@PostMapping ApiResponse<ClauseDeviationService.Result> evaluate(@Valid @RequestBody ClauseDeviationService.Request r){return ApiResponse.ok(service.evaluate(r));}}
