package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
//        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
//
//        System.out.println(result);
//        SpringApplication.run(SpringIn5StepsApplication.class, args);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);







//
//        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
//        System.out.println(result);
    }
}
