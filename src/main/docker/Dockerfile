# 项目所依赖的镜像
FROM java:8

# 将 Maven 构建好的 jar 添加到镜像中
ADD target/*.jar app.jar

# 暴露的端口号
EXPOSE 8080

# 镜像所执行的命令
ENTRYPOINT ["java","-jar","app.jar"]