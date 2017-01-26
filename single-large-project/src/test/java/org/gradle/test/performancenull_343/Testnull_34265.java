package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34265 {
    private final Productionnull_34265 production = new Productionnull_34265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}