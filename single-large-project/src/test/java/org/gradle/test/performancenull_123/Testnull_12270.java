package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12270 {
    private final Productionnull_12270 production = new Productionnull_12270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}