package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22064 {
    private final Productionnull_22064 production = new Productionnull_22064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}