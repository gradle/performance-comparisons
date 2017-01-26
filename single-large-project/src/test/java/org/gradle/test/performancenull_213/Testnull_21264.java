package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21264 {
    private final Productionnull_21264 production = new Productionnull_21264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}