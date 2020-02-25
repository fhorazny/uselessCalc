package com.redhat.fhorazny.first;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FirstTest {
    protected Logger logger;

    public FirstTest() {
        logger = LoggerFactory.getLogger(this.getClass());
    }

    @BeforeAll
    public void initialTestSetup() {
        this.logger.warn("Varuju, setup ...");
    }

    @Test
    public void firsTest() {
        this.logger.warn("varuju a testuju...");
        assert true;
    }

    /**
     * Final project teardown.
     */
    @AfterAll
    public void finalProjectTeardown() {
        this.logger.warn("Varuju, tear down ...");
    }


}
