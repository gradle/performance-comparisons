package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8173 {
    private final Productionnull_8173 production = new Productionnull_8173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}