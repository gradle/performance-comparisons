package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5148 {
    private final Productionnull_5148 production = new Productionnull_5148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}