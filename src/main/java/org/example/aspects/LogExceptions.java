package org.example.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("throws_advice")
public class LogExceptions implements ThrowsAdvice {

    public  void  afterThrowing (Method method, Object[] args, Object target, Exception ex){
//        System.out.println( "ThowsAdvice Exception : succ!" );
        Log log = LogFactory.getLog(this.getClass());
        log.info("Method that threw exception::" + method.getName() + " inputs for the method::" + args[0]+" " + args[1]);
    }
}




