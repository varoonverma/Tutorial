package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by varunverma on 9/03/2014.
 */
public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("knights-aop.xml");
        Knight knight = (Knight) applicationContext.getBean("knight");
        knight.embarkOnQuest();
    }
}
