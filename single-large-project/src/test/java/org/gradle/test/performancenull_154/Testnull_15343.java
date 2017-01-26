package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15343 {
    private final Productionnull_15343 production = new Productionnull_15343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}