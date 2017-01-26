package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37277 {
    private final Productionnull_37277 production = new Productionnull_37277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}