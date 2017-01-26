package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17960 {
    private final Productionnull_17960 production = new Productionnull_17960("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}