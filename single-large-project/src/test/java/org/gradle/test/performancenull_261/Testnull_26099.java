package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26099 {
    private final Productionnull_26099 production = new Productionnull_26099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}