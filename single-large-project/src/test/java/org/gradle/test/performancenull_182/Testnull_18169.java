package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18169 {
    private final Productionnull_18169 production = new Productionnull_18169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}