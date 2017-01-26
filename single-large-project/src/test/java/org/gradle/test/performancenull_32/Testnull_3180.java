package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3180 {
    private final Productionnull_3180 production = new Productionnull_3180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}