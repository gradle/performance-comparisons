package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26086 {
    private final Productionnull_26086 production = new Productionnull_26086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}