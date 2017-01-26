package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16883 {
    private final Productionnull_16883 production = new Productionnull_16883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}