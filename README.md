# spring-boot-jasypt-demo
spring-boot-jasypt-demo

## 启动参数指定外部配置文件

-Dspring.config.location=D:\workspace_idea\spring-boot-jasypt-demo\docs\itclj-sit.properties

## 通过接口获取参数

```shell script
## 明文参数
http://127.0.0.1:8080/itclj/param1
```

## 本地配置加密

- 引入jasypt依赖
```xml
<dependency>
    <groupId>com.github.ulisesbocchio</groupId>
    <artifactId>jasypt-spring-boot-starter</artifactId>
    <version>2.1.2</version>
</dependency>
```

- 加密字符串

```shell script
## input的值就是原密码
## password的值就是参数jasypt.encryptor.password指定的值，即秘钥
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="123456" password=itclj@2020 algorithm=PBEWithMD5AndDES
```

- 执行结果
```shell script
$ java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="123456" password=itclj@2020 algorit
hm=PBEWithMD5AndDES

----ENVIRONMENT-----------------

Runtime: Oracle Corporation Java HotSpot(TM) 64-Bit Server VM 25.251-b08



----ARGUMENTS-------------------

algorithm: PBEWithMD5AndDES
input: 123456
password: itclj@2020



----OUTPUT----------------------

aasHt8cBXKGu17lrbwbc6Q==
```

```shell script
## jasypt 加密后的参数
http://127.0.0.1:8080/itclj/param2
```


