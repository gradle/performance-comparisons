package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11088 {
    private final Productionnull_11088 production = new Productionnull_11088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}