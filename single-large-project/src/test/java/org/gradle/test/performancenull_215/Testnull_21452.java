package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21452 {
    private final Productionnull_21452 production = new Productionnull_21452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}