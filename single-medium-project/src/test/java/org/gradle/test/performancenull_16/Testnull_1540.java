package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1540 {
    private final Productionnull_1540 production = new Productionnull_1540("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}