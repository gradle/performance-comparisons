package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30117 {
    private final Productionnull_30117 production = new Productionnull_30117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}