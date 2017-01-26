package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15076 {
    private final Productionnull_15076 production = new Productionnull_15076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}