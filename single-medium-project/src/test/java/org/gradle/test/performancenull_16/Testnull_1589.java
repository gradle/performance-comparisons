package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1589 {
    private final Productionnull_1589 production = new Productionnull_1589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}