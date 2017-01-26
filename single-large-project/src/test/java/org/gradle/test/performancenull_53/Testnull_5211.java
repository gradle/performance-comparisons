package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5211 {
    private final Productionnull_5211 production = new Productionnull_5211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}