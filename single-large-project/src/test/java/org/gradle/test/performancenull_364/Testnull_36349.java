package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36349 {
    private final Productionnull_36349 production = new Productionnull_36349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}