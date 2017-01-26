package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26064 {
    private final Productionnull_26064 production = new Productionnull_26064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}