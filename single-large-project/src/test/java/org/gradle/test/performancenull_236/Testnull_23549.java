package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23549 {
    private final Productionnull_23549 production = new Productionnull_23549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}