package org.example;

import org.example.aspects.LogBeforeServiceAspect;
import org.example.business.Bank;
import org.example.customexceptions.AccountNumberDoesNotMatchException;
import org.example.customexceptions.AccountNumberNotFoundException;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "org.example")
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Main {
    public static void main(String[] args) throws AccountNumberNotFoundException, AccountNumberDoesNotMatchException {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs.xml");
//        Bank bank = context.getBean("bank", Bank.class);
//        LogBeforeServiceAspect b4Log = context.getBean("b4_log", LogBeforeServiceAspect.class);
//        b4Log.before(bank.depositMonies("",),);
//        ProxyFactoryBean bean = new ProxyFactoryBean();
        Bank bankproxy =(Bank) context.getBean("proxy");
//        bean.setBeanFactory(context);
//        bean.setTarget(bank);
//        bean.setInterceptorNames("throws_advice", "log_around");
//        Bank bankproxy =(Bank) bean.getObject();
        int kcb123 = bankproxy.depositMonies("kcb123", 3000);
        int kcb1231 = bankproxy.findBalance("kcb123");
    }
}