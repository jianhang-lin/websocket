# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### USE

* http://www.easyswoole.com/wstool.html

* 打开网页后，在服务地址中输入ws://127.0.0.1:8080/websocket/wupx，点击开启连接按钮，消息记录中会多一条由服务器端发送的连接成功！记录。

* 接下来再打开一个网页，服务地址中输入ws://127.0.0.1:8080/websocket/huxy，点击开启连接按钮，然后回到第一次打开的网页在消息框中输入{"toUserId":"huxy","message":"i love you"}，点击发送到服务端，第二个网页中会收到服务端推送的消息{"fromUserId":"wupx","message":"i love you","toUserId":"huxy"}。

