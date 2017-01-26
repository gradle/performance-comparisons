package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36771 {
    private final Productionnull_36771 production = new Productionnull_36771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}