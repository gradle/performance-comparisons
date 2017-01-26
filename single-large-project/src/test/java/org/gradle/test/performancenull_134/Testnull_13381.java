package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13381 {
    private final Productionnull_13381 production = new Productionnull_13381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}