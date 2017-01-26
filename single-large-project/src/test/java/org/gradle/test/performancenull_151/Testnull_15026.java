package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15026 {
    private final Productionnull_15026 production = new Productionnull_15026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}