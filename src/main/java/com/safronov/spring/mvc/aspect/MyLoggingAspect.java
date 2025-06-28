package com.safronov.spring.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.safronov.spring.mvc.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature ms = (MethodSignature) pjp.getSignature();
        String methoName = ms.getName();

        System.out.println("Begin of " +  methoName);

        // Запускаем метод, к которому относится advice
        Object targetMethodResult = pjp.proceed();

        System.out.println("End of " +  methoName);
        return targetMethodResult;

    }

}
