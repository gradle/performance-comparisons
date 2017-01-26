package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12215 {
    private final Productionnull_12215 production = new Productionnull_12215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}