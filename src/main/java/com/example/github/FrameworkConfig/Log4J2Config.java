package com.example.github.FrameworkConfig;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

public class Log4J2Config implements ApplicationListener, Ordered {

    /**
     * 提供给日志文件读取配置的key，使用时需要在前面加上 sys:
     */
    private final static String LOG_PATH = "log.path";

    /**
     * spring 内部设置的日志文件的配置key
     */
    private final static String SPRING_LOG_PATH_PROP = "logging.file.path";

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        if (applicationEvent instanceof ApplicationEnvironmentPreparedEvent) {
            ConfigurableEnvironment environment = ((ApplicationEnvironmentPreparedEvent) applicationEvent).getEnvironment();
            String filePath = environment.getProperty(SPRING_LOG_PATH_PROP);
            if (StringUtils.isNotBlank(filePath)) {
                System.setProperty(LOG_PATH, filePath);
            }
        }
    }

    @Override
    public int getOrder() {
        // 当前监听器的启动顺序需要在日志配置监听器的前面，所以此处减 1
        return LoggingApplicationListener.DEFAULT_ORDER - 1;
    }
}

