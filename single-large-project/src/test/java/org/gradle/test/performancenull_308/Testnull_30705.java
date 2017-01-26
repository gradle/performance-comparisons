package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30705 {
    private final Productionnull_30705 production = new Productionnull_30705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}