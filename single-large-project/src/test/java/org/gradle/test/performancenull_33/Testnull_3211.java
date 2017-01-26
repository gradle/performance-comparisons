package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3211 {
    private final Productionnull_3211 production = new Productionnull_3211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}