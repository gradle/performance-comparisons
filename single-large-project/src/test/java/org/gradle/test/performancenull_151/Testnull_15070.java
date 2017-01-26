package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15070 {
    private final Productionnull_15070 production = new Productionnull_15070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}