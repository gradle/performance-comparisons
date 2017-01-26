package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12481 {
    private final Productionnull_12481 production = new Productionnull_12481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}