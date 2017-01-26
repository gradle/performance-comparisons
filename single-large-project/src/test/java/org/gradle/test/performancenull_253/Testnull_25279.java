package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25279 {
    private final Productionnull_25279 production = new Productionnull_25279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}