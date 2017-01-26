package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32668 {
    private final Productionnull_32668 production = new Productionnull_32668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}