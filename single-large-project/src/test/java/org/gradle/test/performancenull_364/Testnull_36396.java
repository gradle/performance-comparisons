package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36396 {
    private final Productionnull_36396 production = new Productionnull_36396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}