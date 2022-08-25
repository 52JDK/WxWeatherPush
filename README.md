1. 地址：[微信公众平台测试申请](https://mp.weixin.qq.com/debug/cgi-bin/sandbox?t=sandbox/login)

![账户信息](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661416581027-7bd2915c-994d-44bf-904c-91bfb3c3eced.png)

>申请注册后扫描二维码，关注，注意对方也需要进行扫码

![用户信息](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661418303817-b69e1c84-2c06-4cf4-af74-35633930dc6f.png)

>编写模板消息如下：可以根据自己的情况填写,注意花括号的不需要更改

>日期：{{date.DATA}} </br>
>天气：{{weather.DATA}} </br>
>当前温度：{{nowTem.DATA}} </br>
>最低温度：{{lowTem.DATA}} </br>
>最高温度：{{highTem.DATA}} </br>
>风速：{{wind.DATA}} </br>
>今天是我们恋爱的：{{loveDate.DATA}} 天 </br>
>距离xx的生日还有：{{birthday.DATA}} 天 </br>
>{{caihongpi.DATA}} </br>
>{{zhText.DATA}} </br>
>{{enText.DATA}} </br>


![模板消息](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661419599273-356e04aa-0fbb-453d-afcc-e057f008cd4f.png)

**保留这个网站不要关闭，后续还有用** </br>

2. 地址：[天行API申请](https://www.tianapi.com/)

>用邮箱注册就ok

![天行数据注册](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661421808060-2c37cc3a-c464-414f-b313-1cd236f316f0.png)

> 回到首页---> 搜索API ---> 搜索彩虹屁---> 申请接口

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661422509222-951c5aed-1c37-43f3-950d-4c4d6e5a1623.png)

> 点击在线测试，如下，参数值等会有用

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661422813164-bccbef72-183d-4e66-b008-d87c79eb7b30.png?x-oss-process=image%2Fresize%2Cw_1478%2Climit_0)

**保留这个网站不要关闭，后续还有用** </br>

3. 本地运行

>百度网盘：链接：https://pan.baidu.com/s/1GfUE8ojU_69Hl5K26t0tRw  提取码：qujf --来自百度网盘超级会员V4的分享

- 将代码导入idea中，需要java本地的开发环境，b站：程序员小R，有视频安装教程
  
- 然后编辑application.yml

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661423676458-05fc8237-a8b7-4dfc-b1f8-fc45e8ea3805.png?x-oss-process=image%2Fresize%2Cw_1500%2Climit_0)

- 测试代码 点击PushTest 文件，代码抛红说明有错误，需要先解决，一般来说是maven问题，刷新maven即可，建议先将微信号 填写自己的先进行测试 

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661423820969-179bfcfd-ef66-4e84-8b56-4201e8f25a62.png?x-oss-process=image%2Fresize%2Cw_1500%2Climit_0)

- 点击箭头按钮，Run push 执行

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661423929022-96046702-f64f-458a-9792-99588a9a1cc5.png?x-oss-process=image%2Fresize%2Cw_1500%2Climit_0)

- 观察控制台,出现红框的 errcode:0 代表执行成功

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661431992440-6fa93746-6f93-4c3a-99bc-98b19cf69589.png?x-oss-process=image%2Fresize%2Cw_1500%2Climit_0)

4.github定时运行

> 打不开github.com 的同学 可以百度加速github.com即可,有多种解决方案,加速github后，登录或者注册

(1) 创建项目
![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661433189230-a81d1e8e-2479-4422-8bd5-60ecd343d460.png?x-oss-process=image%2Fresize%2Cw_937%2Climit_0)

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661433374618-a4d4467d-6628-4bff-b82b-217413267d87.png?x-oss-process=image%2Fresize%2Cw_937%2Climit_0)

(2) 导入项目：


![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661433397771-bfef6046-7f03-47f8-9531-4f0eee777dd3.png?x-oss-process=image%2Fresize%2Cw_937%2Climit_0)

>输入：https://github.com/52JDK/WxWeatherPush

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661433440740-0bddef69-ce2c-434e-b3b2-041b4fe16b0d.png)


(3) 编写配置文件  src--->main---->resources----> application.yml

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661437129599-32601d0d-d465-4f93-9975-690cea25644e.png)

>提交

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661437191660-97fcae16-1212-4885-a8ec-1e00ec26329c.png)

>然后点击actions就发现程序已经开始运行了

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661437291052-d1997b9f-444f-4597-92ac-2867a8e6450b.png)


>出现success，说明程序运行成功,如果报错，则需要点进去查看报错的内容

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661437861484-2ebb576c-a577-414f-bac3-694b90c1a993.png)

(4)如何修改定时任务的时间

![](https://cdn.nlark.com/yuque/0/2022/png/21710408/1661438034371-50cdfcf0-b731-4d54-aed4-0d246d290704.png?x-oss-process=image%2Fresize%2Cw_937%2Climit_0)

>不懂cron可以查看这篇文章：https://blog.csdn.net/Ximerr/article/details/123501772


5.服务器运行

> 敬请期待~