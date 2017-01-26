package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20823 {
    private final Productionnull_20823 production = new Productionnull_20823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}