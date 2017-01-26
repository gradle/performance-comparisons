package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13199 {
    private final Productionnull_13199 production = new Productionnull_13199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}