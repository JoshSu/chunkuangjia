package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) //because it is insode PersonDao, so in order to have a different object ,you need a proxy
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC connection");
    }

}
