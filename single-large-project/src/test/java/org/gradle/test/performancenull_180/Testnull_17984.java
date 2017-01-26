package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17984 {
    private final Productionnull_17984 production = new Productionnull_17984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}