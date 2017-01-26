package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37580 {
    private final Productionnull_37580 production = new Productionnull_37580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}