package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24080 {
    private final Productionnull_24080 production = new Productionnull_24080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}