package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13278 {
    private final Productionnull_13278 production = new Productionnull_13278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}