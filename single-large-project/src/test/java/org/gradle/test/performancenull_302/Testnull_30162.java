package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30162 {
    private final Productionnull_30162 production = new Productionnull_30162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}