package com.example.github.FrameworkConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * AOP配置
 */
@Aspect
@Component
public class SpringAopConfig {

    private Logger logger = LoggerFactory.getLogger(SpringAopConfig.class);
    private static final ThreadLocal<Long> timeTreadLocal = new ThreadLocal<>();
    /**
     * 定义切入点，切入点为com.example.github下的所有函数
     */
    @Pointcut("execution(public * com.example.github..*.*(..))")
    public void webLog(){}

    /**
     * 前置通知：在连接点之前执行的通知
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        timeTreadLocal.set(System.currentTimeMillis());
        // 记录下请求内容
        logger.info("请求地址 : {}" , request.getRequestURL().toString());
        logger.info("请求接口的类型 : {}" , request.getMethod());
        logger.info("IP地址 : {}" , request.getRemoteAddr());
        logger.info("请求接口地址 : {}" , joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("请求参数 : {} " , Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        long startTime = timeTreadLocal.get();
        long callTime = (System.currentTimeMillis() - startTime);
        logger.info("返回参数 : {}" , ret);
        logger.info("耗时（毫秒） : {}" , callTime);
    }

}
