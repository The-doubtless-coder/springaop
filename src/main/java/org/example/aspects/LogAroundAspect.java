package org.example.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Around;
import org.springframework.aop.aspectj.AspectJAroundAdvice;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@Component("log_around")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class LogAroundAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] arguments = invocation.getArguments();
        Log log = LogFactory.getLog(this.getClass());
        log.info("method name::" + invocation.getMethod().getName() +
                " method args::" + Arrays.stream(invocation.getArguments()).collect(Collectors.toList()));
        Object proceed = invocation.proceed();//executes the below after the execution of code in service class
        log.info("return args::" + proceed.toString());
        return proceed;
    }
}