package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28478 {
    private final Productionnull_28478 production = new Productionnull_28478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}