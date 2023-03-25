//package org.example.controller;
//
//import org.example.Main;
//import org.example.aspects.LogBeforeServiceAspect;
//import org.example.business.Bank;
//import org.example.customexceptions.AccountNumberNotFoundException;
//import org.springframework.aop.framework.ProxyFactoryBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Controller;
//
//@Controller("fk_cont")
//public class FakeController {
//
//    public String makeDeposits(String accNo, int amount) {
////        LogBeforeServiceAspect bf = new LogBeforeServiceAspect();
//        ApplicationContext ct = new AnnotationConfigApplicationContext(Main.class);
//        LogBeforeServiceAspect bfBeforeLoggingAspect = ct.getBean("b4_log", LogBeforeServiceAspect.class);
//        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//        proxyFactoryBean.setBeanFactory(ct);
//        proxyFactoryBean.setTarget(Bank.class);
////        proxyFactoryBean.setTargetName("Bank_deposits");
//        proxyFactoryBean.setInterceptorNames("b4_log");
//        Bank bankProxy = (Bank) proxyFactoryBean.getObject();
//
//        int rt = 0;
//        try {
//            rt = bankProxy.depositMonies(accNo, amount);
//        } catch (AccountNumberNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return "yes::" + rt;
//    }
//}
