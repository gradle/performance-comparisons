package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17967 {
    private final Productionnull_17967 production = new Productionnull_17967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}