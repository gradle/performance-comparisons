package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25539 {
    private final Productionnull_25539 production = new Productionnull_25539("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}