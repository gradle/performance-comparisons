package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15298 {
    private final Productionnull_15298 production = new Productionnull_15298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}