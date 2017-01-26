package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28266 {
    private final Productionnull_28266 production = new Productionnull_28266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}