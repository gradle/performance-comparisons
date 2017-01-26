package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26069 {
    private final Productionnull_26069 production = new Productionnull_26069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}