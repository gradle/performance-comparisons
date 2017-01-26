package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15083 {
    private final Productionnull_15083 production = new Productionnull_15083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}