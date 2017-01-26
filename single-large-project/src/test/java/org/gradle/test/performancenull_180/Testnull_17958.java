package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17958 {
    private final Productionnull_17958 production = new Productionnull_17958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}