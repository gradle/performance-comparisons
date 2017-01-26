package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30173 {
    private final Productionnull_30173 production = new Productionnull_30173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}