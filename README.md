# 项目简介
基于脚手架搭建的基于Sharding-JDBC的主从复制demo
# 项目工程结构如下：
```
├── api             定义对外的dubbo接口（在线业务调用）
│                       // 除pojo以及接口定义外，不得有其它业务代码
│
├── service         对外dubbo接口的实现（在线业务调用）
│                       // 不做具体业务，可以包含参数校验逻辑，调用biz完成业务逻辑
│
├── biz             业务实现层
│                       // 真正的业务逻辑实现，包装对dal以及integration的调用
│
├── integration     基础设施层、防腐层
│                       // 对外部服务调用的包装转换
│ 
├── dal             数据库访问层
│                       // 只能处理数据库操作，不得包含任何业务逻辑
│
├── common          公用组件层
│                       // 一般用于存放静态工具类，所有模块均可依赖此模块
│
├── starter         启动模块
│                       // 仅包含启动类，以及一些需要服务启动前的操作
│
├── test            单元层
│                       // 所有的单元测试类都放到这个模块，优点是集中好管理；缺点是测试覆盖率插件会统计不到其它模块的代码 
│
├── setting         配置层
│                       // 所有的配置信息全部放在这一层，方便进行管理
│
├── task            定时任务
│                       // 所有的定时任务信息全部放在这一层，方便进行管理
│
```
