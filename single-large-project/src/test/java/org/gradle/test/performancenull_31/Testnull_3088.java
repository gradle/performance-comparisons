package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3088 {
    private final Productionnull_3088 production = new Productionnull_3088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}