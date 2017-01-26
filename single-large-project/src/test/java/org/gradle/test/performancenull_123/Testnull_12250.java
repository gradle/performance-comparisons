package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12250 {
    private final Productionnull_12250 production = new Productionnull_12250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}