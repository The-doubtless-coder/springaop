package org.example.aspects;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component("b4_log")
public class BeforeLoggingAspect implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.warn("before deposit method::");
    }
}
