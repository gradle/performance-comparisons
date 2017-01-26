package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35378 {
    private final Productionnull_35378 production = new Productionnull_35378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}