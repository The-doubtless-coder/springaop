package org.example;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller("fk_cont")
public class FakeController {

    public String makeDeposits(String accNo, int amount) {
//        BeforeLoggingAspect bf = new BeforeLoggingAspect();
        ApplicationContext ct = new AnnotationConfigApplicationContext(Main.class);
        BeforeLoggingAspect bfBeforeLoggingAspect = ct.getBean("b4_log", BeforeLoggingAspect.class);
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setBeanFactory(ct);
        proxyFactoryBean.setTarget(Bank.class);
//        proxyFactoryBean.setTargetName("Bank_deposits");
        proxyFactoryBean.setInterceptorNames("b4_log");
        Bank bankProxy = (Bank) proxyFactoryBean.getObject();

        int rt = bankProxy.depositMonies(accNo, amount);
        return "yes::" + rt;
    }
}
