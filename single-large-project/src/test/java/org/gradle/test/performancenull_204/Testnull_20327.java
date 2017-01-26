package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20327 {
    private final Productionnull_20327 production = new Productionnull_20327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}