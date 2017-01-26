package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25741 {
    private final Productionnull_25741 production = new Productionnull_25741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}