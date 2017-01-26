package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1860 {
    private final Productionnull_1860 production = new Productionnull_1860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}