package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16874 {
    private final Productionnull_16874 production = new Productionnull_16874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}