package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("componentscan") //this means I want to do component scan in this package
public class SpringIn5StepsComponentScanApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        logger.info("{}", componentDAO);
    }
}
