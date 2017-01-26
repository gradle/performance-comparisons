package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23585 {
    private final Productionnull_23585 production = new Productionnull_23585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}