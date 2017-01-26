package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23501 {
    private final Productionnull_23501 production = new Productionnull_23501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}