package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2264 {
    private final Productionnull_2264 production = new Productionnull_2264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}