package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16823 {
    private final Productionnull_16823 production = new Productionnull_16823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}