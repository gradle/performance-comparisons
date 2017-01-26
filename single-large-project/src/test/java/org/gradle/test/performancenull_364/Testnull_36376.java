package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36376 {
    private final Productionnull_36376 production = new Productionnull_36376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}