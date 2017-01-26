package org.gradle.test.performancenull_126;

import static org.junit.Assert.*;

public class Testnull_12598 {
    private final Productionnull_12598 production = new Productionnull_12598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}