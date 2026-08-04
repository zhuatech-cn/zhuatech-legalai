/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.legalai.config;
import cn.zhuatech.legalai.model.*; import cn.zhuatech.legalai.repository.*; import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.*; import org.springframework.security.crypto.password.PasswordEncoder; import java.time.LocalDate; import java.util.List;
@Configuration public class DataInitializer {
 @Bean CommandLineRunner seed(OperatingUnitRepository units,WorkRecordRepository orders,ResourceRegisterRepository resources,ReviewRecordRepository reviews,UserRepository users,PasswordEncoder encoder){return args->{if(units.count()>0)return;
 var u1=units.save(new OperatingUnit("LEGAL-COM","商业合同组","法务中心",180));var u2=units.save(new OperatingUnit("LEGAL-DATA","数据合规组","法务中心",120));var u3=units.save(new OperatingUnit("LEGAL-IP","知识产权组","法务中心",96));
 var t1=orders.save(new WorkRecord("LEG-260804-018","CLOUD-MSA-2026","云服务框架采购合同",u1,24,16,1,LocalDate.now().plusDays(1),WorkRecord.Status.RUNNING,"采购合同"));
 var t2=orders.save(new WorkRecord("LEG-260804-021","CHANNEL-AGREEMENT","渠道合作协议",u2,18,8,0,LocalDate.now().plusDays(2),WorkRecord.Status.RUNNING,"合作协议"));
 var t3=orders.save(new WorkRecord("LEG-260804-026","DPA-ENTERPRISE","数据处理补充协议",u1,12,0,0,LocalDate.now().plusDays(3),WorkRecord.Status.RELEASED,"数据协议"));
 var t4=orders.save(new WorkRecord("LEG-260803-015","NDA-TEMPLATE","标准保密协议模板复核",u3,20,20,1,LocalDate.now(),WorkRecord.Status.COMPLETED,"标准模板"));
 resources.saveAll(List.of(new ResourceRegister("CLAUSE-KB-01","标准条款知识库",u1,ResourceRegister.Status.RUNNING,98),new ResourceRegister("DOC-DIFF-02","合同差异引擎",u2,ResourceRegister.Status.IDLE,89),new ResourceRegister("OBLIGATION-03","义务追踪服务",u3,ResourceRegister.Status.RUNNING,91),new ResourceRegister("DPA-CHECK-04","数据条款检查器",u1,ResourceRegister.Status.ALARM,74)));
 reviews.saveAll(List.of(new ReviewRecord("RV-260804-032",t1,"人工复核",6,0,ReviewRecord.Result.PASSED,"叶衡"),new ReviewRecord("RV-260804-011",t2,"质量检查",3,0,ReviewRecord.Result.PASSED,"苏宁"),new ReviewRecord("RV-260803-018",t4,"结果抽查",5,1,ReviewRecord.Result.FAILED,"叶衡"),new ReviewRecord("RV-260804-003",t3,"上线确认",4,0,ReviewRecord.Result.PENDING,"苏宁")));
 String demo=encoder.encode("Demo@2026");users.saveAll(List.of(new UserAccount("operator",demo,"苏宁",UserAccount.Role.DOMAIN_USER,"LEGAL-COM"),new UserAccount("planner",demo,"叶衡",UserAccount.Role.DOMAIN_OPERATOR,null),new UserAccount("quality",demo,"顾清",UserAccount.Role.QUALITY,null),new UserAccount("admin",encoder.encode("ZhuaTech@2026"),"系统管理员",UserAccount.Role.ADMIN,null)));};}
}