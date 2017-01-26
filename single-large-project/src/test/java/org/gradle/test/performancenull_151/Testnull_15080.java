package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15080 {
    private final Productionnull_15080 production = new Productionnull_15080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}