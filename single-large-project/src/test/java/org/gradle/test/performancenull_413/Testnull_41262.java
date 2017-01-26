package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41262 {
    private final Productionnull_41262 production = new Productionnull_41262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}