package org.example.aspects;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component("b4_log")
public class LogBeforeServiceAspect implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());
//        method.getDeclaringClass()
        log.info("Declaring class::"+method.getDeclaringClass() + " method name::" + method.getName());
        log.info("first argument::" + args[0] + " second argument::" + args[1]);
        log.info(target.toString());

    }
}
