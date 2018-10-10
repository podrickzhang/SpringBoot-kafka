# SpringBoot-kafka
SpringBoot整合kafka的Demo

## 应用说明
点击startup.java，启动SpringBoot,在测试类BaseTest.java中启动单元测试，测试类发送了两条不同的topic和消息，在测试类的启动窗口会打印
> 向kafka推送数据:[topic--------1] <br>
> 向kafka推送数据:[topic--------2]
说明消息发送成功了
---
在Startup的启动窗口会打印出
> 消息被消费topic--------1<br>
> 消息被消费topic--------2
说明消息被成功消费了
