package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20471 {
    private final Productionnull_20471 production = new Productionnull_20471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}