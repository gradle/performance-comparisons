package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30120 {
    private final Productionnull_30120 production = new Productionnull_30120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}