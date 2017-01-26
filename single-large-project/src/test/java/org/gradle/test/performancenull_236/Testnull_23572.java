package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23572 {
    private final Productionnull_23572 production = new Productionnull_23572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}