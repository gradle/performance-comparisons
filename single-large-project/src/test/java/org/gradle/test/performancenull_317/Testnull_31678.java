package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31678 {
    private final Productionnull_31678 production = new Productionnull_31678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}