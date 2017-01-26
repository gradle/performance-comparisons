package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36351 {
    private final Productionnull_36351 production = new Productionnull_36351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}