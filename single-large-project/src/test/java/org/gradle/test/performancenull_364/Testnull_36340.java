package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36340 {
    private final Productionnull_36340 production = new Productionnull_36340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}