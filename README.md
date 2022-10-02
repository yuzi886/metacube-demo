# 元立方

元立方NFT交易平台demo版本


## 基础框架
1. src/main/java (包含了网络运行文件）
    * com.metacube.demo 
        * 包含了main class，当你需要运行整一个网站的时候，需要跑这个包里面的文件
    * com.metacube.demo.entities 
        * 包含了数据库配置文件，当你需要创建一个表，可以在这个包下面添加文件
    * com.metacube.demo.dao 
        * 包含了业务层和数据访问层的文件，用于调用数据库的数据
        * Respository 接口文件，主要用来将mysql语句转成function，继承了crudReposity数据库访问的function
        * Service 文件用于定义接口，让控制层能够调用
        * ServiceImpl 文件用于实现接口，并调用respository里的function实现对于数据库访问的操作
    * com.metacube.demo.controller
        * 包含了控制层的文件，用来处理http请求
    * com.metacube.demo.exception
        * 包含了处理网页异常的文件，但是目前文件夹里为空
2. src/main/resources (包含了前端文件)
    * static 文件夹可以放入css文件等静态文件
    * templates 文件夹放入动态html

3. src/test/java (包含了Junit test 文件)
    *目前没有加入


## 运行前要做的工作

* 在application.properties里的spring.datasource.username和spring.datasource.password改成自己mysql的账户密码，并且在那个账户里创建metacube 表
* 使用eclipse 运行代码，并且compiler的版本号是 11 (IDEA也能跑这个项目，如果对于修改版本号有问题 可看链接：https://blog.csdn.net/qq_39044199/article/details/79446267)
* 对com.metacube.demo 包里的文件 MetacubeApplication 右键——> run as——>Spring Boot App
