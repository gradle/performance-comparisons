package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26963 {
    private final Productionnull_26963 production = new Productionnull_26963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}