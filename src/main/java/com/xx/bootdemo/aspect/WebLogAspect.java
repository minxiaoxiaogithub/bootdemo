package com.xx.bootdemo.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * 使用AOP统一处理Web请求日志
 * 
 * @author minxi
 *
 */
@Aspect
@Component
public class WebLogAspect {

  @Pointcut("execution(public * com.xx.bootdemo.ui.*.*(..))")
  public void webLog() {}

  /**
   * 
   * @param joinPoint
   */
  @Before("webLog()")
  public void doBefore(JoinPoint joinPoint) {

    System.out.println("我是前置通知!!!");
    // 获取目标方法的参数信息
    Object[] obj = joinPoint.getArgs();
    Signature signature = joinPoint.getSignature();
    // 代理的是哪一个方法
    System.out.println("方法：" + signature.getName());
    // AOP代理类的名字
    System.out.println("方法所在包:" + signature.getDeclaringTypeName());
    // AOP代理类的类（class）信息
    signature.getDeclaringType();
    MethodSignature methodSignature = (MethodSignature) signature;
    String[] strings = methodSignature.getParameterNames();
    System.out.println("参数名：" + Arrays.toString(strings));
    System.out.println("参数值ARGS : " + Arrays.toString(joinPoint.getArgs()));
    // 接收到请求，记录请求内容
    ServletRequestAttributes attributes =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest req = attributes.getRequest();
    // 记录下请求内容
    System.out.println("请求URL : " + req.getRequestURL().toString());
    System.out.println("HTTP_METHOD : " + req.getMethod());
    System.out.println("IP : " + req.getRemoteAddr());
    System.out.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
        + joinPoint.getSignature().getName());

  }
}
