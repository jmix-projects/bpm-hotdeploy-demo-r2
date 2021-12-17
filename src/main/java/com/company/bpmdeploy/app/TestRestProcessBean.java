package com.company.bpmdeploy.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("demo_TestRestProcessBean")
public class TestRestProcessBean {
    private static final Logger log = LoggerFactory.getLogger(TestProcessBean.class);

    public void testProcessMethod() {
        log.info("---- REST PROCESS HAS BEEN CHANGED ----");
    }
}