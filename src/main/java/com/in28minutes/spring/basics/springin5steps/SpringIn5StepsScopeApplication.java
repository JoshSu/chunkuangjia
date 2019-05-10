package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
//        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
//
//        System.out.println(result);
//        SpringApplication.run(SpringIn5StepsApplication.class, args);


        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

//        System.out.println(binarySearch);
//        System.out.println(binarySearch1);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        logger.info("{}", personDAO);
        logger.info("{}", personDAO.getJdbcConnection());

        logger.info("{}", personDAO2);
        logger.info("{}", personDAO2.getJdbcConnection());







//
//        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
//        System.out.println(result);
    }
}
