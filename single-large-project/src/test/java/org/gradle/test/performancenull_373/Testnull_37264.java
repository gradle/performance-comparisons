package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37264 {
    private final Productionnull_37264 production = new Productionnull_37264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}