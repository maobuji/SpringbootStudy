采用java配置springbean<br>
--
提供非spring管理的类获取spring bean的方法<br>

StaticContextUtil在初始化启动时，拿到context引用。<br>
因是静态的，可以使用静态方法让其它类访问获取bean。<br>

使用@Configuratnio注解java类来代替xml配置文件<br>
使用@Bean注解方法把方法来获取bean<br>

@Bean和@Component的区别：<br>
@Component是直接获取类，并不包装。<br>
@Bean经过spring的CGLIB代理，拿到的是spring的包装对象<br>

@Scope注解：<br>
默认为singleton<br>
singleton 表示在spring容器中的单例，通过spring容器获得该bean时总是返回唯一的实例<br>
prototype表示每次获得bean都会生成一个新的对象<br>
request表示在一次http请求内有效（只适用于web应用）<br>
session表示在一个用户会话内有效（只适用于web应用）<br>
globalSession表示在全局会话内有效（只适用于web应用<br>