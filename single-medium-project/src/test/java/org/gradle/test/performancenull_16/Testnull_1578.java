package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1578 {
    private final Productionnull_1578 production = new Productionnull_1578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}