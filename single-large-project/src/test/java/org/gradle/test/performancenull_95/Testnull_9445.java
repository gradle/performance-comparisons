package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9445 {
    private final Productionnull_9445 production = new Productionnull_9445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}