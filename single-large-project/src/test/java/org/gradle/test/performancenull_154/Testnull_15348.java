package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15348 {
    private final Productionnull_15348 production = new Productionnull_15348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}