package org.gradle.test.performancenull_122;

import static org.junit.Assert.*;

public class Testnull_12186 {
    private final Productionnull_12186 production = new Productionnull_12186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}