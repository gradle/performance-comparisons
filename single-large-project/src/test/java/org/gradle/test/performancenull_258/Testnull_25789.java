package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25789 {
    private final Productionnull_25789 production = new Productionnull_25789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}