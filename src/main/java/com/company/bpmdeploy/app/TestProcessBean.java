package com.company.bpmdeploy.app;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(value = "demo_TestProcessBean")
public class TestProcessBean {

    private static final Logger log = LoggerFactory.getLogger(TestProcessBean.class);

    public void testProcessMethod() {
        log.info("----this is a message from second process----");
    }

}