package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17128 {
    private final Productionnull_17128 production = new Productionnull_17128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}