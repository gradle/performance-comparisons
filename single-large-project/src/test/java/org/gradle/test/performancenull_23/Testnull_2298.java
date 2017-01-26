package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2298 {
    private final Productionnull_2298 production = new Productionnull_2298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}