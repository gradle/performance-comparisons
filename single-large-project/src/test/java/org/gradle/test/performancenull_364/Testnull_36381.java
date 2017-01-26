package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36381 {
    private final Productionnull_36381 production = new Productionnull_36381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}