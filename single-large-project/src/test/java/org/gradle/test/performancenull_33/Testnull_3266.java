package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3266 {
    private final Productionnull_3266 production = new Productionnull_3266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}