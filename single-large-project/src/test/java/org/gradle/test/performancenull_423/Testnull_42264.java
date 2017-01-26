package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42264 {
    private final Productionnull_42264 production = new Productionnull_42264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}