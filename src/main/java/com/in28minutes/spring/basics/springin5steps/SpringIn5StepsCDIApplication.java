//package com.in28minutes.spring.basics.springin5steps;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
//import com.in28minutes.spring.basics.springin5steps.cdi.SomeCDIBusiness;
//import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
//
//@SpringBootApplication
//public class SpringIn5StepsCDIApplication {
//
//    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
//
//    public static void main(String[] args) {
////        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
////        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
////
////        System.out.println(result);
////        SpringApplication.run(SpringIn5StepsApplication.class, args);
//
//
//        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
//        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
//
////        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
////        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
//
////        System.out.println(binarySearch);
////        System.out.println(binarySearch1);
////        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
////
////        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
////
////        logger.info("{}", personDAO);
////        logger.info("{}", personDAO.getJdbcConnection());
////
////        logger.info("{}", personDAO2);
////        logger.info("{}", personDAO2.getJdbcConnection());
//        logger.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
//
//
//
//
//
//
////
////        int result = binarySearch.binarySearch(new int [] {12,4,6,}, 3);
////        System.out.println(result);
//    }
//}
