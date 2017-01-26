package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30211 {
    private final Productionnull_30211 production = new Productionnull_30211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}