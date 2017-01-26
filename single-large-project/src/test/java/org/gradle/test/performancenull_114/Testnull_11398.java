package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11398 {
    private final Productionnull_11398 production = new Productionnull_11398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}