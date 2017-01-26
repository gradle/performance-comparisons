package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28468 {
    private final Productionnull_28468 production = new Productionnull_28468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}