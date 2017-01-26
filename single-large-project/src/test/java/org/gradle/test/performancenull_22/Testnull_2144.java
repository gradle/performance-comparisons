package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2144 {
    private final Productionnull_2144 production = new Productionnull_2144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}