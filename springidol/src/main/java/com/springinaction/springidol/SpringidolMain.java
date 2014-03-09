package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by varunverma on 9/03/2014.
 */
public class SpringidolMain {
    public static void main(String[] args) throws PerformanceException {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) applicationContext.getBean("kenny");
        performer.perform();
    }
}
