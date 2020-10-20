package com.example.github;

import com.example.github.FrameworkConfig.Log4J2Config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.github.dao")
public class GithubApplication {

    public static void main(String[] args) {
        //使用log4j2的配置
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        SpringApplication application = new SpringApplication(GithubApplication.class);
        application.addListeners(new Log4J2Config());
        application.run(args);
    }

}
