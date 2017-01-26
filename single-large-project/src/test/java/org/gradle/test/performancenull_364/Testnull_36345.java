package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36345 {
    private final Productionnull_36345 production = new Productionnull_36345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}