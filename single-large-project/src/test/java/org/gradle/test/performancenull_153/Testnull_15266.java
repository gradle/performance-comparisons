package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15266 {
    private final Productionnull_15266 production = new Productionnull_15266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}