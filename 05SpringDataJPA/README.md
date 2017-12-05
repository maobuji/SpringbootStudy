使用spring Data接入mysql

hibernate配置项说明。

参数配置介绍:
spring.jpa.properties.hibernate.hbm2ddl.auto=
create：
    每次加载hibernate时都会删除上一次的生成的表,
    然后根据model类重新生成表，哪怕没有改变,
    这是导致数据库表数据丢失的一个重要原因。

create-drop：
    每次加载hibernate时根据model类生成表，但sessionFactory关闭时,表自动删除。

update：最常用
    首次加载hibernate时根据model类自动建立起表结构（要先建立数据库）
    以后加载hibernate时根据model类自动更新表结构,即使表结构变了,老数据不删除。
    注意:当部署到服务器后，表结构不会立即建立起来，应用首次运行后才会建立表结构。

validate：
    每次加载hibernate时，验证创建数据库表结构，和数据库表比较，不创建新表，会插入新值。

初始化脚本配置
spring.datasource.schema=xxxx-db.sql 可以定义你的建库文件
spring.datasource.data=xxxx-data.sql  可以定义你的数据文件
spring.datasource.initialize＝true|false 可以决定是不是要初始化这些数据库文件
spring.datasource.continueOnError＝true|false 有了错误是否继续运行