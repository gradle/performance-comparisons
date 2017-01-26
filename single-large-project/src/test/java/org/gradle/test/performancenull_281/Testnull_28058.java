package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28058 {
    private final Productionnull_28058 production = new Productionnull_28058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}