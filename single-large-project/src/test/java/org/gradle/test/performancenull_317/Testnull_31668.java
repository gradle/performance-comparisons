package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31668 {
    private final Productionnull_31668 production = new Productionnull_31668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}