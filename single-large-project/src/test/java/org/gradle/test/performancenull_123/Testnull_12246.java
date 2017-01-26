package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12246 {
    private final Productionnull_12246 production = new Productionnull_12246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}