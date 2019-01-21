##### 1.概述
- 此处接口提供端和使用接口端都是使用 Java 编写的。
- Thrift 编译器下载：http://apache.fayea.com/thrift
- 参考资料：http://www.cnblogs.com/duanxz/p/5516558.html

##### 2.基本实现步骤
* （1）基于 thrift 语法编写所需的 thrift 接口，如：HelloWorld.thrift
* （2）使用 thrift 编译器将使用 thrift 编写的接口编译成对应语言的接口，如：HelloWorldService
* （3）在服务端编写该接口的实现类，并将接口暴露出去，如：HelloWorldServiceImpl & ThriftServerDemo
* （4）将 thrift 编译完后的接口 copy 一份到客户端，并在客户端实现调用，如：HelloWorldClientService & ThriftClientDemo