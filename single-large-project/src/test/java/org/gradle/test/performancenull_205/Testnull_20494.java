package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20494 {
    private final Productionnull_20494 production = new Productionnull_20494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}