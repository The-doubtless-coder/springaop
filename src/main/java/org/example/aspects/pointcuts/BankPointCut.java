package org.example.aspects.pointcuts;

import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.StaticMethodMatcher;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class BankPointCut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        String name = method.getName();
        if(name.equalsIgnoreCase("findBalance")){
            return false;
        }
        return true;
    }
}
