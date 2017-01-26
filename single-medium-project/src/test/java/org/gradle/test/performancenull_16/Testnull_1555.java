package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1555 {
    private final Productionnull_1555 production = new Productionnull_1555("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}