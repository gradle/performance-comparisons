package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20589 {
    private final Productionnull_20589 production = new Productionnull_20589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}