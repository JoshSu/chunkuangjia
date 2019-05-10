package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm bubblesortAlgo;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int [] sortedNumbers = bubblesortAlgo.sort(numbers);
        System.out.println(bubblesortAlgo);

        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestory(){
        logger.info("predestory");
    }
}
