package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32620 {
    private final Productionnull_32620 production = new Productionnull_32620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}