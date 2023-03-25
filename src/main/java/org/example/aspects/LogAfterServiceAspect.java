package org.example.aspects;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component("after_log")
public class LogAfterServiceAspect implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        Log log = LogFactory.getLog(this.getClass());
        log.info("returned value::"+returnValue +
                " received args::" + args[0] + " " +
                args[1] + " class where logging happened::" +target.toString());
    }

}
