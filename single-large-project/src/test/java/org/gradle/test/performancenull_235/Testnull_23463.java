package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23463 {
    private final Productionnull_23463 production = new Productionnull_23463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}