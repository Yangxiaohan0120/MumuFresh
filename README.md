# SpringBootMall

### 本项目旨在使用SpringBoot 框架开发商城网页。主要有以下几个模块

[用户模块]()
[商品分类模块]()
[商品模块]()
[购物车模块]()
[订单模块]()

### 项目框架 

```
-- src 
  -- controller 
  -- service 
  -- model 
     -- dao 
     -- pojo 
     -- req 
     -- vo 
     -- query 
  -- filter 
  -- config 
  -- exception 
  -- common 
  -- utils 
-- resources 
  -- mappers 
  -- static 
```

### 主要数据链路

Controller层负责传递 url请求

Service 层进行功能的实现

Mapper 使用mysql进行数据库的查询 

Model 中包含了dao（mapper的定义）、pojo（各个模块属性的定义）、req（请求或者发送的对象，与pojo有权限区别）、query（实现特定请求类）、VO（对象查看，有权限区别）


### 辅助类：

filter 过滤器的定义，检查是否登陆，是否是管理员，以及操作的日志记录

config 配置类，规定各类过滤器的作用域

exception 异常类的定义，对各类异常进行枚举类记录

common 放置常量，规定返回信息的格式

utils 常用工具，二维码生成器，MD5校验等


### 页面展示：

