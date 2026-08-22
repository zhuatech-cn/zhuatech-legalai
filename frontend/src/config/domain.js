/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
export const domain={
 code:'LEGALAI',systemName:'知华 AI 法务审查平台',englishName:'LEGAL REVIEW INTELLIGENCE',theme:{primary:'#6b5146',dark:'#352c28',accent:'#ae7d4f',},
 workspace:'法务合规中心 / 合同管理部',fieldWorkspace:'商业合同组',period:'2026-08-04 · 实时运营',liveText:'运营数据于 10:36 更新',fieldContextLabel:'当前工作周期',fieldContext:'八月第一周',fieldUser:'苏宁',fieldRole:'合同审核员',adminUser:'叶衡',adminRole:'法务运营负责人',
 adminTitle:'企业合同风险控制台',adminBreadcrumb:'合同智能运营 / 全局态势',adminSubtitle:'集中管理合同预审、重大条款、审查时效、模板偏离和履约义务。',exportAction:'导出运营报告',createAction:'新建审查任务',
 chartTitle:'合同处理完成趋势',chartSubtitle:'本月实际完成率 / 运营目标',chartLabels:['01日','05日','09日','13日','17日','21日','25日','29日','31日'],loadTitle:'合同领域负荷',loadSubtitle:'开放任务占团队处理能力',recordsTitle:'重点审查任务',recordsSubtitle:'按优先级、期限与风险项排序',issueTitle:'需要关注的运营事项',issueSubtitle:'需要跨团队确认或升级处理',
 recordName:'审查任务',itemName:'合同',unitName:'业务部门',batchName:'合同类型',planName:'条款',doneName:'已审查',exceptionName:'风险项',unitLabel:'项',
 listBreadcrumb:'合同工作台 / 审查任务',listSubtitle:'为企业法务提供合同预审、条款比对、风险清单、义务追踪和法律知识检索能力。',listSummary:[['在审合同','68'],['本周处理','24'],['风险项','9'],['高优先级','3',true]],tabs:['全部','待处理','进行中','待确认','已归档'],
 fieldBreadcrumb:'合同运营 / 合同审核员工作台',fieldTitle:'合同审核工作台',fieldSubtitle:'待审合同 18 份 · 高风险 3 份 · 今日到期 5 份',fieldSecondary:'查看工作日历',reportAction:'提交处理反馈',fieldNoticeTitle:'智能服务运行正常',fieldNotice:'任务数据完整率 93.8%',
 steps:[
 '合同上传',
 '文本解析',
 '条款审查',
 '业务会签',
 '义务追踪'
],documentAction:'查看操作手册',printAction:'导出工作档案',resourceCardTitle:'智能资源状态',resourceValueLabel:'当前处理量',resourceHealthLabel:'服务健康度',quickSubtitle:'常用工作入口',quickActions:[
 [
  '智能预审',
  '/shopfloor/report',
  '风险条款、修改建议与依据'
 ],
 [
  '合同台账',
  '/shopfloor/material',
  '版本、相对方与业务负责人'
 ],
 [
  '条款知识库',
  '/shopfloor/resources',
  '模板、案例与审查口径'
 ],
 [
  '重大风险升级',
  '/shopfloor/andon',
  '无限责任、数据与知识产权'
 ]
],
 reportDefaults:[6,1],reportTitle:'审查任务处理反馈',reportSubtitle:'记录已审查、风险项和处理建议。',reportSuccess:'法务审查意见已提交',reportPlaceholder:'填写处理结论、引用依据、后续要求与负责人',reportFootnote:'提交后自动进入负责人复核队列',ruleTitle:'智能处理质量门禁',ruleSubtitle:'LEGALAI-POLICY · V1.0',rules:[['人工复核','关键结果必须'],['引用与依据','必须保留'],['权限检查','执行前完成'],['运行评估','每月',true]],fieldTotals:[['68','在审合同'],['3','高优先级'],['9','风险项'],['93.8%','数据完整率']],
 adminMenus:[['/admin','home','运营控制中心'],['/admin/work-orders','order','审查任务'],['/admin/samples','box','合同台账'],['/admin/schedule','calendar','计划与排期'],['/admin/methods','process','规则与模板'],['/admin/reviews','quality','审核与决策'],['/admin/resources','machine','智能资源'],['/admin/report','chart','运营分析']],
 fieldMenus:[['/shopfloor','home','合同审核工作台'],['/shopfloor/report','report','处理反馈'],['/shopfloor/tasks','order','我的任务'],['/shopfloor/material','box','合同台账'],['/shopfloor/resources','machine','智能资源'],['/shopfloor/andon','risk','问题升级',3]],
 moduleTitles:{tasks:['我的待办任务','查看优先级、期限与处理状态'],material:['合同台账','查询完整资料、历史版本与责任人'],resources:['智能资源中心','管理知识、模型、连接器和处理服务'],andon:['问题升级','提交重大风险、争议或阻塞事项'],samples:['合同台账','统一管理业务对象、资料与上下游依赖'],schedule:['计划与排期','协调负责人、参与方和交付窗口'],methods:['规则与模板','维护处理口径、质量标准和模板'],reviews:['审核与决策','记录确认、驳回和复核要求'],report:['运营分析','分析质量、效率、异常和处理周期']},
 tagline:'把合同风险看清楚，把法务意见讲明白',storyTitle:'把合同风险看清楚，<br/>把法务意见讲明白',storyText:'为企业法务提供合同预审、条款比对、风险清单、义务追踪和法律知识检索能力。',pattern:[2,4,7,9,12,15,18,21,24,27,29,31],loginStats:[['60','在审合同'],['93.8%','数据完整率'],['3','高优先级']],loginTitle:'企业合同风险控制台',adminDemo:'管理 / 运营 / 分析',fieldDemo:'任务 / 处理 / 反馈'
}
export const records=[
 {no:'LEG-260804-018',name:'云服务框架采购合同',code:'CLOUD-MSA-2026',unit:'商业合同组',group:'采购中心',plan:24,done:16,exception:3,due:'08-04',batch:'采购合同',status:'审查中',progress:67,priority:'加急'},
 {no:'LEG-260804-021',name:'渠道合作协议',code:'CHANNEL-AGREEMENT',unit:'销售合同组',group:'商业中心',plan:18,done:8,exception:2,due:'08-05',batch:'合作协议',status:'待业务确认',progress:44,priority:'关注'},
 {no:'LEG-260804-026',name:'数据处理补充协议',code:'DPA-ENTERPRISE',unit:'数据合规组',group:'法务中心',plan:12,done:0,exception:0,due:'08-06',batch:'数据协议',status:'待审查',progress:12,priority:'加急'},
 {no:'LEG-260803-015',name:'标准保密协议模板复核',code:'NDA-TEMPLATE',unit:'知识产权组',group:'法务中心',plan:20,done:20,exception:1,due:'08-03',batch:'标准模板',status:'已归档',progress:100,priority:'正常'},
 {no:'LEG-260804-031',name:'软件许可与实施合同',code:'SOFTWARE-LICENSE',unit:'商业合同组',group:'采购中心',plan:16,done:11,exception:2,due:'08-07',batch:'许可合同',status:'谈判中',progress:76,priority:'关注'}
]
export const resources=[{code:'CLAUSE-01',name:'标准条款知识库',unit:'合同管理部',status:'运行中',health:98,value:'1,286',valueUnit:'条',note:'覆盖 16 类常见合同'},{code:'COMPARE-02',name:'模板偏离比对引擎',unit:'法务技术组',status:'复核中',health:89,value:'42',valueUnit:'份',note:'3 份合同等待人工确认'},{code:'OBLIG-03',name:'履约义务追踪服务',unit:'法务运营组',status:'预警',health:76,value:'67',valueUnit:'项',note:'5 项义务临近期限'}]
export const reviews=[{no:'REV-260804-032',title:'云服务合同责任限制复核',type:'重大条款复核',detail:'6 项风险 · 叶衡',result:'待确认'},{no:'REV-260804-011',title:'渠道协议独家条款确认',type:'业务法务会签',detail:'18 段修改 · 苏宁',result:'通过'},{no:'REV-260803-018',title:'数据协议跨境条款检查',type:'数据合规',detail:'缺口 2 项',result:'异常'}]
export const adminMetrics=[['在审合同','68','较上月新增 6','blue'],['本周处理','24','平均周期 2.6 天','green'],['风险项','9','其中 3 项临近期','orange'],['高优先级','3','需要负责人决策','red']]
export const fieldMetrics=[['我的任务','6','3 项高优先级','blue'],['今日已处理','18','质量检查已完成','green'],['风险项','9','3 项临近期限','orange'],['数据完整率','93.8%','较上周提升 2.4%','slate']]
export const chartActual=[18,26,37,45,56,63,72,81,87],chartTarget=[20,30,40,50,60,70,80,90,96]
export const loads=[
 [
  '采购与技术合同',
  86,
  '开放审查 12 份'
 ],
 [
  '销售与渠道合同',
  78,
  '开放审查 9 份'
 ],
 [
  '数据与隐私协议',
  72,
  '开放审查 6 份'
 ],
 [
  '知识产权与劳动合同',
  64,
  '开放审查 5 份'
 ]
]
export const issues=[
 [
  '责任',
  '云服务合同包含无限责任表述',
  '预计金额 280 万 · 需管理层决策',
  '待审议'
 ],
 [
  '数据',
  'DPA 未明确子处理者通知机制',
  '涉及海外云服务商',
  '补充中'
 ],
 [
  '履约',
  '渠道协议季度返利核算义务临期',
  '责任部门尚未确认',
  '待处理'
 ]
].map(x=>({type:x[0],title:x[1],detail:x[2],status:x[3]}))
