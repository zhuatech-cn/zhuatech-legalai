/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.legalai;import cn.zhuatech.legalai.service.ClauseDeviationService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class ClauseDeviationServiceTests{private final ClauseDeviationService s=new ClauseDeviationService();/**
                                                                                                       * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                       */
@Test void blocksUnsafeContract(){var r=s.evaluate(new ClauseDeviationService.Request(5,0,true,false,false,true));assertEquals("BLOCK",r.status());}/**
                                                                                                                                                                                                                                                           * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                           */
@Test void acceptsStandardTerms(){var r=s.evaluate(new ClauseDeviationService.Request(0,12,false,true,true,false));assertEquals("ACCEPT",r.status());}}
