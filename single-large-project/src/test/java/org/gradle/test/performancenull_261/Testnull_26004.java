package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26004 {
    private final Productionnull_26004 production = new Productionnull_26004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}