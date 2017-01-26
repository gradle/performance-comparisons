package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1551 {
    private final Productionnull_1551 production = new Productionnull_1551("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}