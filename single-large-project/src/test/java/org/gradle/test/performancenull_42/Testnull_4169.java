package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4169 {
    private final Productionnull_4169 production = new Productionnull_4169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}