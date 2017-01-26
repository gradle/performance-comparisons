package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20572 {
    private final Productionnull_20572 production = new Productionnull_20572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}