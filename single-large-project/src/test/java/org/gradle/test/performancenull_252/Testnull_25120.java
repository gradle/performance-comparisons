package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25120 {
    private final Productionnull_25120 production = new Productionnull_25120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}