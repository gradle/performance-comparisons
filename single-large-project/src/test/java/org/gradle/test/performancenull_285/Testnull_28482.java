package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28482 {
    private final Productionnull_28482 production = new Productionnull_28482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}